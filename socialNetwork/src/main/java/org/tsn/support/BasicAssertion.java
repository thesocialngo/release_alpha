package org.tsn.support;

import org.apache.commons.lang3.StringUtils;
import org.tsn.support.validation.BasicValidator;
import org.tsn.support.validation.ValidationException;
import org.tsn.utility.JavaUtility;

public class BasicAssertion
{
	public final static BasicAssertion	shared	= new BasicAssertion();

	public BasicAssertion()
	{
	}

	public void type(Object o, Class<?> cl, String message)
		throws ValidationException
	{
		if (!o.getClass().equals(cl))
		{
			throw validationException(message);
		}
	}

	public void notType(Object o, Class<?> cl, String message)
		throws ValidationException
	{
		if (o.getClass().equals(cl))
		{
			throw validationException(message);
		}
	}

	public void isTrue(boolean b, String message)
			throws ValidationException
	{
		if (b == false)
		{
			throw validationException(message);
		}
	}

	public void isPositive(long l, String message)
			throws ValidationException
	{
		if (l < 0)
		{
			throw validationException(message);
		}
	}

	public void isGreaterThanZero(long l, String message)
		throws ValidationException
	{
		if (l <= 0)
		{
			throw validationException(message);
		}
	}

	public void isNull(Object o, String msg)
			throws ValidationException
	{
		if (o == null)
		{
			return;
		}
		throw validationException(defaultString(msg, "object may not be null."));
	}

	public void notNull(Object o)
			throws ValidationException
	{
		notNull(o, null);
	}

	public void notNull(Object o, String msg)
			throws ValidationException
	{
		if (o != null)
		{
			return;
		}
		throw validationException(defaultString(msg, "object may not be null."));
	}

	public void notEmpty(String str)
			throws ValidationException
	{
		notEmpty(str, null);
	}

	public void notEmpty(String str, String msg)
			throws ValidationException
	{
		if (StringUtils.isEmpty(str) == true)
		{
			throw validationException(defaultString(msg,
					"Null or empty string not allowed"));
		}
	}

	public void notEmpty(Object[] array, String msg)
			throws ValidationException
	{
		if (array == null || array.length == 0)
		{
			throw validationException(defaultString(msg,
					"Null or empty array not allowed"));
		}
	}

	public void notBlank(String str)
			throws ValidationException
	{
		notBlank(str, null);
	}

	public void notBlank(String str, String msg)
			throws ValidationException
	{
		if (StringUtils.isBlank(str) == true)
		{
			throw validationException(defaultString(msg,
					"Null or blank string not allowed"));
		}
	}

	public void equal(long id, long value, String msg)
			throws ValidationException
	{
		if (id != value)
		{
			throw validationException("specified values to not match " + msg);
		}
	}

	public void equal(Object o1, Object o2, String msg)
			throws ValidationException
	{
		if ((o1 != null && o1 == null) || (o1 == null && o2 != null)
				|| !o1.equals(o2))
		{
			throw validationException("specified values are not equal " + msg);
		}
	}

	public void greaterThan(long id, long value, String msg)
	{
		if (id <= value)
		{
			throw validationException(defaultString(msg,
					"specified value must be greater than " + value));
		}
	}

	public void lessThan(long id, long value, String msg)
	{
		if (id >= value)
		{
			throw validationException(defaultString(msg,
					"specified value must be less than " + value));
		}
	}

	public void date(String dateString, String dateFormat)
		throws ValidationException
	{
		date(dateString, dateFormat, null);
	}

	public void date(String dateString, String dateFormat, String msg)
		throws ValidationException
	{
		date(dateString, new String[]
				{ dateFormat }, msg);
	}

	public void date(String dateString, String[] dateFormats)
		throws ValidationException
	{
		date(dateString, dateFormats, null);
	}

	/**
	 **/
	public void date(String dateString, String[] dateFormats, String msg)
		throws ValidationException
	{
		notEmpty(dateString, "date() dateString may not be empty");
		if (BasicValidator.shared.isDate(dateString, dateFormats) == false)
		{
			throw validationException(defaultString(msg, "Invalid date: '"
					+ dateString + "' for the specified formats: "
					+ JavaUtility.shared.toString(dateFormats)));
		}
	}

	/**
	 * Throws ValidationException if the specified value is not an appropriate
	 * format for an ssn. Calls through to BasicValidator.isSSN()
	 *
	 * @see BasicValidator.isSSN()
	 **/
	public void ssn(String s)
			throws ValidationException
	{
		ssn(s, null);
	}

	public void ssn(String s, String msg)
			throws ValidationException
	{
		notEmpty(s, "ssn() specified ssn is empty");
		if (BasicValidator.shared.isSSN(s) == false)
		{
			throw validationException(defaultString(msg, "Invalid ssn: '" + s
					+ "'"));
		}
	}

	public void emailAddress(String s)
			throws ValidationException
	{
		emailAddress(s, null);
	}

	/**
	 * Throws a ValidationException if the specified value is not a valid
	 * email address.
	 *
	 * @see BasicValidator.emailAddress()
	 **/
	public void emailAddress(String s, String msg)
			throws ValidationException
	{
		notEmpty(s, "emailAddress() specified email address is empty");
		if (BasicValidator.shared.isEmailAddress(s) == false)
		{
			throw validationException(defaultString(msg,
					"Invalid email address: '" + s + "'"));
		}
	}

	public ValidationException validationException(String message)
	{
		return new ValidationException(message);
	}

	protected String defaultString(String msg, String def)
	{
		return StringUtils.isEmpty(msg)? def : msg;
	}

	public void areEqualSize(Object[] list1, Object[] list2, String msg)
			throws ValidationException
	{
		if (list1 == null && list2 == null)
		{
			return;
		}

		if (list1 != null && list2 != null && list1.length == list2.length)
		{
			return;
		}

		throw validationException(defaultString(msg,
				"object lists must be the same size."));
	}
}
