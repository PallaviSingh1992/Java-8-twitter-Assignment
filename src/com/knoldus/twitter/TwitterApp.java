package com.knoldus.twitter;

import twitter4j.Status;
import java.util.Comparator;
import java.util.List;

//Class to implement the twitter functionality usage.

public class TwitterApp  {
    public static void main(String[] args){
        try {
            TwitterUtility tweetsData=new TwitterUtility();
            List<Status> tweetList=tweetsData.catchTweets();

            //Comparators defined and declared.
            Comparator<Status> reTweets=(Status tweetOne,Status tweetTwo)->((Integer)tweetOne.getRetweetCount()).compareTo((Integer)tweetTwo.getRetweetCount());
            Comparator<Status> noOfLikes=(Status tweetOne,Status tweetTwo)->((Integer)tweetOne.getFavoriteCount()).compareTo((Integer)tweetTwo.getFavoriteCount());
            Comparator<Status> latest=(Status tweetOne,Status tweetTwo)->(tweetOne.getCreatedAt()).compareTo(tweetTwo.getCreatedAt());

            //The Result
            tweetList.sort(reTweets);
            System.out.println("Status of Re-tweets :");
            tweetList.stream().forEach(tweetsData::prettyPrint);

            tweetList.sort(noOfLikes);
            System.out.println("Status of Likes :");
            tweetList.stream().forEach(tweetsData::prettyPrint);

            tweetList.sort(latest);
            System.out.println("Status of Re-tweets :");
            tweetList.stream().forEach(tweetsData::prettyPrint);

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
