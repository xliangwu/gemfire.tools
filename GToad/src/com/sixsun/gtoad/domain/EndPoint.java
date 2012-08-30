package com.sixsun.gtoad.domain;

import java.io.Serializable;

public class EndPoint implements Serializable {

	private static final long serialVersionUID = -7312833286437684239L;

	private String hostname;
	private int port;

	public EndPoint() {
	}

	/**
	 * Constructor
	 * 
	 * @param hostname
	 * @param port
	 */
	public EndPoint(String hostname, int port) {
		super();
		this.hostname = hostname;
		this.port = port;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "EndPoint [hostname=" + hostname + ", port=" + port + "]";
	}

}
