package com.collector.gazelle.dto;

import com.google.gson.Gson;

public class GzEvent extends GzDTO {

	private static final long serialVersionUID = 1L;
	private RoutingInfo routingInfo;
	private String jsonPayload;
	private AuditInfo auditInfo;

	public RoutingInfo getRoutingInfo() {
		return routingInfo;
	}

	public void setRoutingInfo(RoutingInfo routingInfo) {
		this.routingInfo = routingInfo;
	}

	public String getJsonPayload() {
		return jsonPayload;
	}

	public void setJsonPayload(String jsonPayload) {
		this.jsonPayload = jsonPayload;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	@Override
	public String toString(){
		Gson gson = new Gson();
		return gson.toJson(this); 
	}
	
	/*public static void main(String[] args){
		
		GzEvent e = new GzEvent();
		RoutingInfo r = new RoutingInfo("x", "y");
		AuditInfo a = new AuditInfo("sridhar", 100L);
		
		e.setAuditInfo(a);
		e.setRoutingInfo(r);
		e.setJsonPayload("{name:something}");
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(e));
		
		//\"routingInfo\":{\"topicName\":\"x\",\"eventType\":\"y\"},
		String input = "{\"jsonPayload\":\"{name:something}\",\"auditInfo\":{\"sentBy\":\"sridhar\",\"createdAt\":100}}";
		e= gson.fromJson(input, GzEvent.class);
		
		System.out.println(gson.toJson(e));

		
	}*/
}
