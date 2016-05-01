package com.knoldus.twitter;

import twitter4j.conf.ConfigurationBuilder;

/*
   Class to manage the twitter Configurations.
   Defines a method which returns configurationBuilder
 */

public class TwitterConfiguration {

    ConfigurationBuilder configurationBuilder=new ConfigurationBuilder();

    public ConfigurationBuilder getConfigurationBuilder() {
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey("")
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("");
        return configurationBuilder;
    }
}
