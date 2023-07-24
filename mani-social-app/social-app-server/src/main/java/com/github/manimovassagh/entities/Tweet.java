package com.github.manimovassagh.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Tweet extends PanacheEntity {

    public String tweet;
    public String username;



    public Tweet(String tweet, String userName, LocalDateTime createdAt) {
        this.tweet = tweet;
        this.username = userName;

    }

    public Tweet() {
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }



    @Override
    public String toString() {
        return "Tweet{" +
                "tweet='" + tweet + '\'' +
                ", userName='" + username + '\'' +

                ", id=" + id +
                '}';
    }
}
