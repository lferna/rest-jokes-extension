package com.jokes.remote.properties;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JokeBean {

	private String text;

	public String getText() {
		return text;
	}
	
}
