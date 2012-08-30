package com.sixsun.gtoad.exception;

import com.sixsun.gtoad.domain.GToad;

public class ConnectionFailureException extends ConnectionException {

	private static final long serialVersionUID = -2176621876050294817L;

	@Override
	public int getErrorCode() {
		return GToad.CONNECTION_BLOCKED;
	}

	@Override
	public String getErrorDescription() {
		return GToad.CONNECTION_BLOCKED_DESC;
	}

}
