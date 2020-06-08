package com.demo.arnaldi.model;

import java.io.Serializable;

public class Search implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4077924539964283669L;
	private String topic;
	private String language;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
