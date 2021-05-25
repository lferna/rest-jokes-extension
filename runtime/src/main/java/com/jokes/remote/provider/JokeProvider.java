package com.jokes.remote.provider;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.ext.Provider;

import com.jokes.remote.properties.JokeBean;


public class JokeProvider implements ClientRequestFilter {


    @Inject
    JokeBean jokeBean;
	
	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		System.out.println("The bean is: "+jokeBean);
	}
   
	
}