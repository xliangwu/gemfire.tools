package com.sixsun.gtoad.exception;

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
	
	
	public AbstractException(){
		super();
	}
	
	public AbstractException(String message){
		super(message);
	}
	
	public AbstractException(String message,Throwable cause){
		super(message,cause);
	}

	@Override
	public String toString() {
		return "Exception [getErrorCode()=" + getErrorCode() + ", getErrorDescription()=" + getErrorDescription() + "]";
	}
	
	
}
