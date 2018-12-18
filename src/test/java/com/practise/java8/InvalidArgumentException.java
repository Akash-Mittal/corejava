package com.practise.java8;

public class InvalidArgumentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7243730349806241412L;

	public InvalidArgumentException() {
		super();
		// 
	}

	public InvalidArgumentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// 
	}

	public InvalidArgumentException(String message, Throwable cause) {
		super(message, cause);
		// 
	}

	public InvalidArgumentException(String message) {
		super(message);
		// 
	}

	public InvalidArgumentException(Throwable cause) {
		super(cause);
		// 
	}

}