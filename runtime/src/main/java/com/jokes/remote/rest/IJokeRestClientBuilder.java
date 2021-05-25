package com.jokes.remote.rest;

import java.net.MalformedURLException;

import org.eclipse.microprofile.rest.client.RestClientBuilder;


public interface IJokeRestClientBuilder {

	String getJoke(String url) throws MalformedURLException;

}