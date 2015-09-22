package org.tsn.support.validation;

public class ValidationException extends RuntimeException

{
	private static final long	serialVersionUID	= -123550343721742762L;

	public ValidationException()
	{
	}

	public ValidationException(String msg)
	{
		// super(msg);
	}

	public ValidationException(String msg, String fieldName)
	{
		// super(msg, fieldName);
	}

	public ValidationException(String msg, int code)
	{
		// super(msg, code);
	}

	public ValidationException(String msg, int code, String fieldName)
	{
		// super(msg, code, fieldName);
	}

	public ValidationException(Throwable th)
	{
		// super(th);
	}
}
