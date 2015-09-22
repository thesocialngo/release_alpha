package org.tsn.support.validation;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.GenericValidator;

public class BasicValidator // extends ApplicationObject
{
	public final static BasicValidator	shared	= new BasicValidator();

	public BasicValidator()
	{
	}

	public boolean isDate(String dateString, String dateFormat)
	{
		boolean strict = false;
		return GenericValidator.isDate(dateString, dateFormat, strict);
	}

	public boolean isDate(String dateString, String[] dateFormat)
	{
		if (StringUtils.isEmpty(dateString) || dateFormat == null)
		{
			return false;
		}
		boolean result = true;
		for (int i = 0; result == true && i < dateFormat.length; i++)
		{
			if (StringUtils.isEmpty(dateFormat[i]))
			{
				result = false;
			}
			else
			{
				result = isDate(dateString, dateFormat[i]);
			}
		}
		return result;
	}

	public boolean isSSN(String ssn)
	{
		return isPersonalSSN(ssn) || isBusinessTaxID(ssn);
	}

	/**
	 * Acceptable formats...
	 * 	 xxx-xx-xxxx
	 *   xxx.xx.xxxx
	 *   xxx xx xxxx
	 **/
	public boolean isPersonalSSN(String ssn)
	{
		if (ssn.length() == 11)
		{
			char d = ssn.charAt(3);
			if (ssn.charAt(6) == d && (d == ' ' || d == '.' || d == '-'))
			{
				ssn = StringUtils.replace(ssn, "" + d, "");
			}
		}
		if (ssn.length() == 9)
		{
			long val = Long.parseLong(ssn);
			return val >= 0;
		}
		return false;
	}

	/**
	 * Acceptable formats...
	 * 	 xxxxxxx-xx
	 * 	 xxxxxxx.xx
	 * 	 xxxxxxx xx
	 **/
	public boolean isBusinessTaxID(String ssn)
	{
		if (ssn.length() == 10)
		{
			char d = ssn.charAt(7);
			if (d == ' ' || d == '.' || d == '-')
			{
				ssn = StringUtils.replace(ssn, "" + d, "");
			}
		}
		if (ssn.length() == 9)
		{
			long val = Long.parseLong(ssn);
			return val >= 0;
		}
		return false;
	}

	public boolean isEmailAddress(String email)
	{
		return GenericValidator.isEmail(email);
	}

}
