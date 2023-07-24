package com.github.manimovassagh.controllers;


import com.github.manimovassagh.entities.Tweet;
import com.github.manimovassagh.utility.CustomResponse;
import com.github.manimovassagh.utility.Status;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TweetController {


    @GET()
    @Path("/tweet")
    public List<Tweet> getAllTweets() {
        return Tweet.listAll();

    }


    @POST()
    @Path("/tweet")
    @Transactional
    public Tweet createTweet(Tweet tweet) {
        Tweet.persist(tweet);
        return tweet;
    }
}
