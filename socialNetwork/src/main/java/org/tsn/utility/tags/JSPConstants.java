package org.tsn.utility.tags;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.tsn.resources.SessionConstants;

public class JSPConstants extends SimpleTagSupport
{

	private String	constant;

	public void setConstant(String constantName)
	{
		this.constant = constantName;
	}

	StringWriter	sw	= new StringWriter();

	public void doTag()
		throws JspException,
			IOException
	{
		if (constant != null)
		{
			/* Use message from attribute */
			JspWriter out = getJspContext().getOut();
			// out.println(SessionConstants.constant );
			out.println(getSessionConstatntValue(constant) );
		}
		else
		{
			/* use message from the body */
			getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
	}

	private String getSessionConstatntValue(String constantName)
	{
		Class<?> thisClass = null;
		try
		{
			thisClass = SessionConstants.class;
			Field[] aClassFields = thisClass.getDeclaredFields();

			for (Field f : aClassFields)
			{

				String fName = f.getName();
				if (fName.equals(constantName))
				{
					return f.get(thisClass).toString();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args)
	{
		JSPConstants c = new JSPConstants();
		System.out.println(c.getSessionConstatntValue("USER_PROFILE"));
	}

}
