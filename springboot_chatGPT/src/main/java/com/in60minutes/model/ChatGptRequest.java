package com.in60minutes.model;

import java.util.ArrayList;
import java.util.List;

public class ChatGptRequest {
	
	private String model;
	private List<Message> messages = new ArrayList<>();
	
	
	public ChatGptRequest(String model, String content) {
		super();
		this.model = model;
		this.messages.add(new Message("role",content));
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	

}
