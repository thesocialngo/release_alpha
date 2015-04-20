package org.tsn.tos;

import java.util.Date;
import java.util.List;

public class UserProfile extends BaseTransferObject{
	
	String firstName;
	String lastName;
	String password;
	String rePassword;
	char gender;
	Date dateOfBirth;
	String email;
	String phoneNumber;
	String desciption;
	String facebookID;
	String tweeeterID;
	String googleID;
	int educationID;
	int occupationID;
	int securityQuestionId_1;
	int securityQuestionId_2;
	int securityQuestionId_3;
	int securityQuestionId_4;
	int securityQuestionId_5;
	
	String securityAnswer_1 = null;
	String securityAnswer_2 = null;
	String securityAnswer_3 = null;
	String securityAnswer_4 = null;
	String securityAnswer_5 = null;
	
	List<SecurityQuestion> securityQuestions;
	List<SecurityAnswer> securityAnwers;
	
	public List<SecurityQuestion> getSecurityQuestions() {
		return securityQuestions;
	}
	public void setSecurityQuestions(List<SecurityQuestion> securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	public List<SecurityAnswer> getSecurityAnwers() {
		return securityAnwers;
	}
	public void setSecurityAnwers(List<SecurityAnswer> securityAnwers) {
		this.securityAnwers = securityAnwers;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the desciption
	 */
	public String getDesciption() {
		return desciption;
	}
	/**
	 * @param desciption the desciption to set
	 */
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	/**
	 * @return the facebookID
	 */
	public String getFacebookID() {
		return facebookID;
	}
	/**
	 * @param facebookID the facebookID to set
	 */
	public void setFacebookID(String facebookID) {
		this.facebookID = facebookID;
	}
	/**
	 * @return the tweeeterID
	 */
	public String getTweeeterID() {
		return tweeeterID;
	}
	/**
	 * @param tweeeterID the tweeeterID to set
	 */
	public void setTweeeterID(String tweeeterID) {
		this.tweeeterID = tweeeterID;
	}
	/**
	 * @return the googleID
	 */
	public String getGoogleID() {
		return googleID;
	}
	/**
	 * @param googleID the googleID to set
	 */
	public void setGoogleID(String googleID) {
		this.googleID = googleID;
	}
	/**
	 * @return the educationID
	 */
	public int getEducationID() {
		return educationID;
	}
	/**
	 * @param educationID the educationID to set
	 */
	public void setEducationID(int educationID) {
		this.educationID = educationID;
	}
	/**
	 * @return the occupationID
	 */
	public int getOccupationID() {
		return occupationID;
	}
	/**
	 * @param occupationID the occupationID to set
	 */
	public void setOccupationID(int occupationID) {
		this.occupationID = occupationID;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSecurityQuestionId_1() {
		return securityQuestionId_1;
	}
	public void setSecurityQuestionId_1(int securityQuestionId_1) {
		this.securityQuestionId_1 = securityQuestionId_1;
	}
	public int getSecurityQuestionId_2() {
		return securityQuestionId_2;
	}
	public void setSecurityQuestionId_2(int securityQuestionId_2) {
		this.securityQuestionId_2 = securityQuestionId_2;
	}
	public int getSecurityQuestionId_3() {
		return securityQuestionId_3;
	}
	public void setSecurityQuestionId_3(int securityQuestionId_3) {
		this.securityQuestionId_3 = securityQuestionId_3;
	}
	public int getSecurityQuestionId_4() {
		return securityQuestionId_4;
	}
	public void setSecurityQuestionId_4(int securityQuestionId_4) {
		this.securityQuestionId_4 = securityQuestionId_4;
	}
	public int getSecurityQuestionId_5() {
		return securityQuestionId_5;
	}
	public void setSecurityQuestionId_5(int securityQuestionId_5) {
		this.securityQuestionId_5 = securityQuestionId_5;
	}
	public String getSecurityAnswer_1() {
		return securityAnswer_1;
	}
	public void setSecurityAnswer_1(String securityAnswer_1) {
		this.securityAnswer_1 = securityAnswer_1;
	}
	public String getSecurityAnswer_2() {
		return securityAnswer_2;
	}
	public void setSecurityAnswer_2(String securityAnswer_2) {
		this.securityAnswer_2 = securityAnswer_2;
	}
	public String getSecurityAnswer_3() {
		return securityAnswer_3;
	}
	public void setSecurityAnswer_3(String securityAnswer_3) {
		this.securityAnswer_3 = securityAnswer_3;
	}
	public String getSecurityAnswer_4() {
		return securityAnswer_4;
	}
	public void setSecurityAnswer_4(String securityAnswer_4) {
		this.securityAnswer_4 = securityAnswer_4;
	}
	public String getSecurityAnswer_5() {
		return securityAnswer_5;
	}
	public void setSecurityAnswer_5(String securityAnswer_5) {
		this.securityAnswer_5 = securityAnswer_5;
	}
	
	
	public String getRePassword()
	{
		return rePassword;
	}
	public void setRePassword(String rePassword)
	{
		this.rePassword = rePassword;
	}
	@Override
	public String toString()
	{
		return "UserProfile [firstName=" + firstName + ", lastName=" + lastName
			+ ", password=" + password + ", rePassword=" + rePassword
			+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
			+ ", email=" + email + ", phoneNumber=" + phoneNumber
			+ ", desciption=" + desciption + ", facebookID=" + facebookID
			+ ", tweeeterID=" + tweeeterID + ", googleID=" + googleID
			+ ", educationID=" + educationID + ", occupationID=" + occupationID
			+ ", securityQuestionId_1=" + securityQuestionId_1
			+ ", securityQuestionId_2=" + securityQuestionId_2
			+ ", securityQuestionId_3=" + securityQuestionId_3
			+ ", securityQuestionId_4=" + securityQuestionId_4
			+ ", securityQuestionId_5=" + securityQuestionId_5
			+ ", securityAnswer_1=" + securityAnswer_1 + ", securityAnswer_2="
			+ securityAnswer_2 + ", securityAnswer_3=" + securityAnswer_3
			+ ", securityAnswer_4=" + securityAnswer_4 + ", securityAnswer_5="
			+ securityAnswer_5 + ", securityQuestions=" + securityQuestions
			+ ", securityAnwers=" + securityAnwers + "]";
	}
	 
	
	 
	 
	 
	 

}
