package org.tsn.tos;

public class SecurityQuestion {

	private int id;
	private String description;

	public SecurityQuestion(int questionID, String desc) {

		this.id = questionID;
		this.description = desc;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}