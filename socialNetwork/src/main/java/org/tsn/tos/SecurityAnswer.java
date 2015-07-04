package org.tsn.tos;

import org.tsn.entity.TProfile;
import org.tsn.entity.TSecurityQuestions;

public class SecurityAnswer extends BaseTransferObject{
	private static final long	serialVersionUID	= -2984611330003326183L;
	private int securityAnswerId;
	private SecurityQuestion securityQuestion;
	  
	private String description;

	public int getSecurityAnswerId() {
		return securityAnswerId;
	}

	public void setSecurityAnswerId(int securityAnswerId) {
		this.securityAnswerId = securityAnswerId;
	}

	public SecurityQuestion getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(SecurityQuestion securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

 
}