package com.jokes.remote.rest;

import java.net.MalformedURLException;
import java.net.URL;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import com.jokes.remote.properties.JokeBean;
import com.jokes.remote.provider.IJokeRestClient;


/**
 * Clase cliente Rest
 * @author Capgemini
 *
 */
@ApplicationScoped
public class JokeRestClientBuilder implements IJokeRestClientBuilder  { 

	@Inject
	JokeBean jokeBean;
	
	@Override
	public String getJoke(String url) throws MalformedURLException {
		System.out.println("Start: "+jokeBean ); 
		IJokeRestClient restClient = RestClientBuilder.newBuilder().baseUrl(new URL(url)).build(IJokeRestClient.class);
		return restClient.getJoke();
	}

	
}
