package com.jokes.rest.client.extension.deployment;

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
//  	 beanBuild.addBeanClass(JokeRestClientBuilder.class);
//  	 beanBuild.addBeanClass(JokeBean.class);
//  	 beanBuild.addBeanClass(JokeProvider.class);
//  	 beanBuild.setUnremovable();
//  	 return beanBuild.build();
//  }
  

}
