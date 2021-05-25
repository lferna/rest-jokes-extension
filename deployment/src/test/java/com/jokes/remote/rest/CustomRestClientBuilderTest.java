package com.jokes.remote.rest;

import java.net.MalformedURLException;

import javax.inject.Inject;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.RestClientDefinitionException;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import com.jokes.remote.properties.JokeBean;
import com.jokes.remote.provider.JokeProvider;
import com.jokes.remote.rest.CustomRestClientBuilder;

import io.quarkus.test.QuarkusUnitTest;


public class CustomRestClientBuilderTest {

	  @Inject
	  private CustomRestClientBuilder customRest;
	  
	  @RegisterExtension
	  static final QuarkusUnitTest config = new QuarkusUnitTest()
	    .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)
	    		.addClasses(CustomRestClientBuilder.class, JokeBean.class,
	    				JokeProvider.class)
	    		.addAsResource("application.properties"));
	    
	  @Test
	  public void testGreeting() {
	     try {
	    	String joke = customRest.getJoke(
					ConfigProvider.getConfig()
					.getValue("com.jokes.remote.rest.IDummyRestClient/mp-rest/url", 
								String.class));
			
	    	System.out.println("Joke: "+joke);
			
		} catch (IllegalStateException | RestClientDefinitionException | MalformedURLException e) {
			e.printStackTrace();
		}
	  }
	
	
}
