package com.example.restservice;

public class Progress {

	private final String region;
	private final String statusValue;
	private final String statusColor;

	public Progress(String region, String statusValue,String statusColor) {
		this.region = region;
		this.statusValue = statusValue;
		this.statusColor = statusColor;
	}

	public String getRegion() {
		return region;
	}

	public String getStatusValue() {
		return statusValue;
	}

	public String getStatusColor() {
		return statusColor;
	}
	

}
