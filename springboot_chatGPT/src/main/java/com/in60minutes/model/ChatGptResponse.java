package com.in60minutes.model;

import java.util.List;

public class ChatGptResponse {

	private List<Choice> choices;

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}
	
}
