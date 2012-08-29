package com.citi.gtoad.exception;

public abstract class AbstractException extends Exception{

	private static final long serialVersionUID = 6442474308376571393L;

	/**
	 * 
	 * @return error code
	 */
	public abstract int getErrorCode();
	
	/**
	 * 
	 * @return error description
	 */
	public abstract String getErrorDescription();
}
