package com.sono.bean;

public class LogMessage {
	private int id;
	private String date;
	private String MessageLocation;
	private String MessageRank;
	private String Message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessageLocation() {
		return MessageLocation;
	}
	public void setMessageLocation(String messageLocation) {
		MessageLocation = messageLocation;
	}
	public String getMessageRank() {
		return MessageRank;
	}
	public void setMessageRank(String messageRank) {
		MessageRank = messageRank;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
}
