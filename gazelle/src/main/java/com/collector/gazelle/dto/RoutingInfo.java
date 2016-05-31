package com.collector.gazelle.dto;

public class RoutingInfo {

	private String topicName;
	private String eventType;

	
	
	public RoutingInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public RoutingInfo(String topicName, String eventType) {
		super();
		this.topicName = topicName;
		this.eventType = eventType;
	}

}
