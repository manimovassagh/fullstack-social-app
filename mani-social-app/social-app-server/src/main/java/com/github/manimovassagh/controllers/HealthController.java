package com.github.manimovassagh.controllers;

import com.github.manimovassagh.utility.CustomResponse;
import com.github.manimovassagh.utility.Status;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.HashMap;
import java.util.Map;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HealthController {



    @GET()
    @Path("/health")
    public CustomResponse<Map<String, String>> healthCheck() {
        Map<String, String> healthInfo = new HashMap<>();
        healthInfo.put("Health", "is checked");
        CustomResponse<Map<String, String>> response=new CustomResponse<>();
        response.setStatus(Status.SUCCESS);
        response.setResponse(healthInfo);
        return response;
    }
}
