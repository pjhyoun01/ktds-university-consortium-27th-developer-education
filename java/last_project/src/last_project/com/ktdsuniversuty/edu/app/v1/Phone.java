package last_project.com.ktdsuniversuty.edu.app.v1;

/**
 * 전화번호 클래스
 */
public class Phone {
	public static enum Type {
		PERSONAL, HOME, COMPANY
	}

	/**
	 * 전화번호 유형 (PERSONAL 개인, HOME 집, COMPANY 회사)
	 */
	private Phone.Type phoneType;
	private String phoneNumber;

	public Phone(Phone.Type phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public Phone.Type getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
