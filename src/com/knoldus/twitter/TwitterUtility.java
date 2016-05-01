package com.knoldus.twitter;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

/*
Class to manage the functionality related to twitter application.
 */
public class TwitterUtility {

    //Method to access the tweets.
    public List<Status> catchTweets() throws TwitterException{
        TwitterConfiguration twitterConfig=new TwitterConfiguration();
        TwitterFactory factory=new TwitterFactory(twitterConfig.getConfigurationBuilder().build());
        Twitter twitter=factory.getInstance();
        return twitter.getHomeTimeline();
    }

    //Method to print the tweets in following manner.
    public void prettyPrint(Status status) {
        System.out.println("Date ->" + status.getCreatedAt() +
                "\n Username ->" + status.getUser().getScreenName() +
                "\nLikes ->" + status.getFavoriteCount() +
                "\nRe-Tweets ->" + status.getRetweetCount() +
                "\nText ->" + status.getText() +
                "\n Location ->" + status.getGeoLocation());
    }
}
