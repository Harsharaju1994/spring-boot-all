package com.in60minutes.model;

public class Choice {

	private int index;
	private Message Massage;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Message getMassage() {
		return Massage;
	}
	public void setMassage(Message massage) {
		Massage = massage;
	}
	public Choice(int index, Message massage) {
		super();
		this.index = index;
		Massage = massage;
	}
	
}
