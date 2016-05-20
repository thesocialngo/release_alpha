package org.tsn.tos;

public class SecurityQuestion extends BaseTransferObject
{

	private static final long	serialVersionUID	= -5001414889126969043L;
	private int					id;
	private String				description;

	public SecurityQuestion()
	{
	}

	public SecurityQuestion(int questionID, String desc)
	{

		this.id = questionID;
		this.description = desc;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}
