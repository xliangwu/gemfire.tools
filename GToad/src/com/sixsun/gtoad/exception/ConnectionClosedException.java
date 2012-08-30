package com.sixsun.gtoad.exception;

import com.sixsun.gtoad.domain.GToad;

public class ConnectionClosedException extends ConnectionException{

	private static final long serialVersionUID = -1712531332241665049L;

	@Override
	public int getErrorCode() {
		return GToad.CONNECTION_CLOSED;
	}

	@Override
	public String getErrorDescription() {
		return GToad.CONNECTION_CLOSED_DESC;
	}

}
