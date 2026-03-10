package last_project.com.ktdsuniversuty.edu.app.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import last_project.com.ktdsuniversuty.edu.app.v1.Phone.Type;

public class ContactManager {

	private List<Contact> contactList;

	public ContactManager() {
		this.contactList = new ArrayList<>();
	}

	// contactList에 Contact 인스턴스를 추가하는 기능
	public void addNumber(Contact contact) {
		this.contactList.add(contact);
	}

	// contactList에 모든 연락처 정보를 출력하는 기능
	public void getAllInfo() {
		if (contactList.size() > 0) {
			for (Contact contact : contactList) {
				System.out.println(contact.getName() + "의 연락처");
				System.out.println("별명\t: " + contact.getNickname());
				System.out.println("email\t: " + contact.getEmail());
				System.out.println("회사 이름\t: " + contact.getCompany().getCompanyName());
				System.out.println("직급\t: " + contact.getCompany().getJob());
				System.out.println("회사 주소\t: " + contact.getCompany().getAddress());
				getAllNumber(contact);
			}
		} else {
			System.out.println("연락처가 없습니다. 연락처를 추가해주세요");
		}
		System.out.println();
	}

	public void getAllNumber(Contact contact) {
		for (Phone phone : contact.getPhones()) {
			checkPhoneType(phone);
			System.out.println("\t: " + phone.getPhoneNumber());
		}
		System.out.println();
	}

	public void checkPhoneType(Phone phone) {
		if (phone.getPhoneType() == Type.PERSONAL) {
			System.out.print("휴대폰");
		} else if (phone.getPhoneType() == Type.HOME) {
			System.out.print("집 전화");
		} else {
			System.out.print("회사 전화");
		}
	}

	public void search(int searchType, String searchContent) {
		int searchCount = 0;
		for (Contact contact : this.contactList) {
			for (Phone phone : contact.getPhones()) {
				if (searchType == 1 && searchNum(contact, searchContent, phone) > 0) {
					searchCount++;
				} else if (searchType == 2 && searchName(contact, searchContent, phone) > 0) {
					searchCount++;
				} else if (searchType == 3 && searchEamil(contact, searchContent, phone) > 0) {
					searchCount++;
				}
			}
		}
		if (searchCount > 0) {
			System.out.println();
			System.out.println("총 " + searchCount + "건의 연락처가 검색되었습니다.");
			System.out.println();
		} else {
			System.out.println("검색 결과가 없습니다");
			System.out.println();
		}
	};

	public void getOneNumber(Contact contact, Phone phone) {
		System.out.print(contact.getName() + "의 ");
		checkPhoneType(phone);
		System.out.println(phone.getPhoneNumber());
	}

	private int searchNum(Contact contact, String searchContent, Phone phone) {
		int isFound = 0;
		if (phone.getPhoneNumber().contains(searchContent)) {
			getOneNumber(contact, phone);
			isFound++;
		}
		return isFound;
	}

	private int searchName(Contact contact, String searchContent, Phone phone) {
		int isFound = 0;
		if (contact.getName().contains(searchContent) || contact.getFirstName().contains(searchContent)
				|| contact.getLastName().contains(searchContent)
				|| contact.getCompany().getCompanyName().contains(searchContent)) {
			getOneNumber(contact, phone);
			isFound++;
		}
		return isFound;
	}

	private int searchEamil(Contact contact, String searchContent, Phone phone) {
		int isFound = 0;
		if (contact.getEmail().contains(searchContent)) {
			getOneNumber(contact, phone);
			isFound++;
		}
		return isFound;
	}

	// 연락처 정보 수정 기능
	public void modifyNumber(int index, Contact contact) {
		Scanner sc = new Scanner(System.in);
		Contact tempContact = contactList.get(index);
		// 이름
		System.out.print("이름을 변경하시겠습니까? (y/n): ");
		String YesOrNo = sc.nextLine();
		String inputText = "";
		if (YesOrNo.equalsIgnoreCase("y")) {
			System.out.println("변경할 정보를 입력해주세요: ");
			inputText = sc.nextLine();
			String[] nameArray = inputText.split("");
			String newName = "";
			if (nameArray.length > 0) {
				for (int i = 1; i < nameArray.length; i++) {
					newName += nameArray[i];
				}
				tempContact.setFirstName(newName);
				tempContact.setLastName(nameArray[0]);
				tempContact.setName(tempContact.getLastName() + tempContact.getFirstName());
			}
		}
		// 별명
		System.out.print("별명을 변경하시겠습니까? (y/n): ");
		YesOrNo = sc.nextLine();
		if (YesOrNo.equalsIgnoreCase("y")) {
			System.out.print("변경할 정보를 입력해주세요: ");
			inputText = sc.nextLine();
			if (!inputText.equals("")) {
				tempContact.setNickname(inputText);
			}
		}
		// 이메일
		System.out.print("이메일을 변경하시겠습니까? (y/n): ");
		YesOrNo = sc.nextLine();
		if (YesOrNo.equalsIgnoreCase("y")) {
			System.out.print("변경할 정보를 입력해주세요: ");
			inputText = sc.nextLine();
			if (!inputText.equals("")) {
				tempContact.setNickname(inputText);
			}
		}
		// 전화번호
		System.out.print("전화번호를 변경하시겠습니까? (y/n): ");
		YesOrNo = sc.nextLine();
		if (YesOrNo.equalsIgnoreCase("y")) {
			for (Phone phone : tempContact.getPhones()) {
				checkPhoneType(phone);
				System.out.print("를 수정하시겠습니까? (y/n):");
				YesOrNo = sc.nextLine();
				if (YesOrNo.equalsIgnoreCase("y")) {
					System.out.print("변경할 정보를 입력해주세요: ");
					inputText = sc.nextLine();
					if (!inputText.equals("")) {
						phone.setPhoneNumber(inputText);
//						if (phone.getPhoneType() == Phone.Type.PERSONAL) {
//							tempContact.getPhones().get(0).setPhoneNumber(inputText);
//						} else if (phone.getPhoneType() == Phone.Type.HOME) {
//							tempContact.getPhones().get(1).setPhoneNumber(inputText);
//						} else {
//							tempContact.getPhones().get(2).setPhoneNumber(inputText);
//						}
					}
				}
			}
		} else {
			// n일 경우
			System.out.print("전화번호를 추가하시겠습니까? (y/n): ");
			YesOrNo = sc.nextLine();
			int checkNum = 0;
			if (YesOrNo.equalsIgnoreCase("y")) {
				for (Phone phone : tempContact.getPhones()) {
					if (phone.getPhoneType() == Type.PERSONAL) {
						checkNum = 1;
					} else if (phone.getPhoneType() == Type.HOME) {
						checkNum = 2;
					} else if (phone.getPhoneType() == Type.COMPANY) {
						checkNum = 3;
					}
					
					
					
//					if (checkNum == 1) {
//						
//					} else if (checkNum == 2) {
//						
//					} else if (checkNum == 3) {
//						
//					} else {
//						
//					}
					
					// 특정 enum이 없을 때만 
//					if (phone.getPhoneType() == Type.COMPANY && phone.getPhoneType() == Type.HOME
//							&& phone.getPhoneType() == Type.PERSONAL) {
//						return;
//					} else {
//						checkPhoneType(phone);
					// TODO 없는 종류의 번호만 추가하는 기능
//						System.out.print("의 번호를 추가하시겠습니까? (y/n): ");
//						YesOrNo = sc.nextLine();
//						if (YesOrNo.equalsIgnoreCase("y")) {
//							System.out.print("변경할 정보를 입력해주세요: ");
//							inputText = sc.nextLine();
//							if (!inputText.equals("")) {
//								// 현재의 폰의 정보를 수정
//								// TODO
//								phone.setPhoneNumber(inputText);
////								num1.getPhones().get(0).getPhoneNumber()
//							}
//
//						}
//					}
				}
			}
		}
		System.out.println();

//		if (modiNum == 1 && !tempContact.getName().replace(" ", "").equals(modifyContact)) {
//			String[] nameSplit = modifyContact.split("");
//			String connect = "";
//			tempContact.setLastName(nameSplit[0]);
//			for (int i = 1; i < nameSplit.length; i++) {
//				connect += nameSplit[i];
//			}
//			tempContact.setFirstName(connect);
//			tempContact.setName(tempContact.getLastName() + " " + tempContact.getFirstName());
//		} else if (!tempContact.getNickname().replace(" ", "").equals(modifyContact)) {
//			if (!tempContact.getNickname().equals(modifyContact)) {
//				tempContact.setNickname(modifyContact);
//			}
//		} else if (!tempContact.getEmail().replace(" ", "").equals(modifyContact)) {
//			
//		} 
//		else if (!tempContact.getPhones()) {
//			
//		}

	}

	// 연락처 정보 삭제 기능
	public void delete(int index) {
		System.out.println(this.contactList.get(index).getName() + "의 연락처를 삭제했습니다");
		System.out.println();
		this.contactList.remove(index);
	}

	public static void main(String[] args) {

		List<Phone> phoneList1 = new ArrayList<>();
		phoneList1.add(new Phone(Type.PERSONAL, "010-1234-1721"));
		phoneList1.add(new Phone(Type.HOME, "010-1234-5086"));
//		phoneList1.add(new Phone(Type.COMPANY, "010-1515-4734"));

		List<Phone> phoneList2 = new ArrayList<>();
		phoneList2.add(new Phone(Type.PERSONAL, "010-1423-5638"));
		phoneList2.add(new Phone(Type.HOME, "010-9683-1530"));
		phoneList2.add(new Phone(Type.COMPANY, "010-2452-1721"));

		Company company = new Company("ktds university", "인턴", "방배동 1001-1");

		Contact num1 = new Contact("박제", "jaehyoun@ktds.com", "재현", "박", phoneList1, company, "바보");
		Contact num2 = new Contact("정승제", "psj@ktds.com", "승재", "박", phoneList2, company, "멍청이");

		ContactManager cm = new ContactManager();

		cm.addNumber(num1);
		cm.addNumber(num2);

		cm.getAllInfo();

//		cm.search(1, "721");
//		cm.search(2, "승");
//		cm.search(2, "박");
//		cm.search(2, "k");
//		cm.search(3, "@kt");
//		cm.search(4, "721");

//		cm.modifyNumber(0, "이");
		Scanner sc = new Scanner(System.in);
		System.out.println("수정 번호 입력");
		int a = sc.nextInt();

		cm.modifyNumber(a, cm.contactList.get(a));
		cm.getAllInfo();

//		cm.delete(0);
//		cm.getAllInfo();
//		cm.delete(0);
//		cm.getAllInfo();

	}
}
