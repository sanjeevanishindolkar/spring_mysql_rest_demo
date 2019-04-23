package com.user.dto;
/**
 * 
 * @author Gaurav
 *
 */
public class UserDTO {

	private Integer id;
	private String userName;
	private String phoneNumber;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
}
