package last_project.com.ktdsuniversuty.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	/**
	 * 연락처의 이름
	 */
	private String name;
	/**
	 * 연락처 별명
	 */
	private String nickname;
	/**
	 * 연락처 이메일
	 */
	private String email;
	/*
	 * 이름(재현)
	 */
	private String firstName;
	/**
	 * 성(박)
	 */
	private String lastName;

	/**
	 * 전화번호 목록
	 */
	private List<Phone> phones;

	/**
	 * 근무중인 회사 정보
	 */
	private Company company;

	/**
	 * 메모
	 */
	private String meno;

	public Contact() {
		this.phones = new ArrayList<>();
	}

	public Contact(String nickname, String email, String firstName, String lastName, List<Phone> phones,
			Company company, String meno) {
		this.nickname = nickname;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phones = phones;
		this.company = company;
		this.meno = meno;
		this.name = lastName + firstName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getMeno() {
		return this.meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	

}
