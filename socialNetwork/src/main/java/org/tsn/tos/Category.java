package org.tsn.tos;

public class Category extends BaseTransferObject
{

	private static final long	serialVersionUID	= -1362056495775611270L;
	private int					id;
	private String				description;

	public Category(int categoryID, String desc)
	{

		this.id = categoryID;
		this.description = desc;
	}

	public Category(String desc)
	{

		this.description = desc;
	}

	public Category()
	{
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
