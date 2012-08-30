package com.sixsun.gtoad.connection;

import com.sixsun.gtoad.domain.EndPoint;
import com.sixsun.gtoad.domain.Protocol;

public class ConnectionConfig {

	private EndPoint endPoint;
	private Protocol protocol;
	private String version;

	public ConnectionConfig(EndPoint endPoint, Protocol protocol) {
		super();
		this.endPoint = endPoint;
		this.protocol = protocol;
	}

	public EndPoint getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(EndPoint endPoint) {
		this.endPoint = endPoint;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
