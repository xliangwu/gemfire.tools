package com.sixsun.gtoad.domain;

public enum Protocol {

	JMX("jmx", "JMX Protocol");
	private final String name;
	private final String desc;

	Protocol(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
}
