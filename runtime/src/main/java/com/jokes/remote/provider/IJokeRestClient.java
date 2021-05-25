package com.jokes.remote.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@RegisterProvider(JokeProvider.class)
public interface IJokeRestClient{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getJoke(); 
}
