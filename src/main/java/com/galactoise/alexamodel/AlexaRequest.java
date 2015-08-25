package com.galactoise.alexamodel;

public class AlexaRequest {

	private AlexaRequestIntent intent;
	private AlexaRequestType type;
	private String requestId;
	private String timestamp;
	private String reason;
	
	public AlexaRequestIntent getIntent() {
		return intent;
	}
	
	public void setIntent(AlexaRequestIntent intent) {
		this.intent = intent;
	}
	
	public AlexaRequestType getType() {
		return type;
	}
	
	public void setType(AlexaRequestType type) {
		this.type = type;
	}
	
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "AlexaRequest [intent=" + intent + ", type=" + type
				+ ", requestId=" + requestId + ", timestamp=" + timestamp
				+ ", reason=" + reason + "]";
	}
}
