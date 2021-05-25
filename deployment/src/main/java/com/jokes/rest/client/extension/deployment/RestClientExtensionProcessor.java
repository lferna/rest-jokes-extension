package com.jokes.rest.client.extension.deployment;

import com.jokes.remote.properties.JokeBean;
import com.jokes.remote.provider.JokeProvider;
import com.jokes.remote.rest.CustomRestClientBuilder;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class RestClientExtensionProcessor {

    private static final String FEATURE = "rest-jokes-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
//  @BuildStep
//  public AdditionalBeanBuildItem producer() {
//  	 AdditionalBeanBuildItem.Builder beanBuild = AdditionalBeanBuildItem.builder();
//  	 beanBuild.addBeanClass(CustomRestClientBuilder.class);
//  	 beanBuild.addBeanClass(JokeBean.class);
//  	 beanBuild.addBeanClass(JokeProvider.class);
//  	 beanBuild.setUnremovable();
//  	 return beanBuild.build();
//  }
  

}
