package com.jokes.remote.rest;

import java.net.MalformedURLException;

import javax.inject.Inject;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.RestClientDefinitionException;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import com.jokes.remote.properties.JokeBean;
import com.jokes.remote.provider.JokeProvider;

import io.quarkus.test.QuarkusUnitTest;


public class JokeRestClientBuilderTest {

	  @Inject
	  private JokeRestClientBuilder jokeClient;
	  
	  @RegisterExtension
	  static final QuarkusUnitTest config = new QuarkusUnitTest()
	    .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)
	    		.addClasses(JokeRestClientBuilder.class, JokeBean.class,
	    				JokeProvider.class));
	    
	  @Test
	  public void testGreeting() {
	     try {
	    	String joke = jokeClient.getJoke("https://api.chucknorris.io/jokes/random");			
	    	System.out.println("Joke: "+joke);
			
		} catch (IllegalStateException | RestClientDefinitionException | MalformedURLException e) {
			e.printStackTrace();
		}
	  }
	
	
}
