package com.collector.gazelle.dto;

public class AuditInfo {

	private String sentBy;
	private Long createdAt;

	public AuditInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuditInfo(String sentBy, Long createdAt) {
		super();
		this.sentBy = sentBy;
		this.createdAt = createdAt;
	}

	public String getSentBy() {
		return sentBy;
	}

	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

}
