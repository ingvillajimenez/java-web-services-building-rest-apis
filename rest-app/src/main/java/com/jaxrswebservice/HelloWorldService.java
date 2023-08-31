package com.jaxrswebservice;

import jakarta.ws.rs.GET; // @interface GET
import jakarta.ws.rs.Path; // @interface Path
import jakarta.ws.rs.core.Response; // abstract class Response

@Path("/ws")
public class HelloWorldService {

    @GET
    @Path("/greeting")
    public Response myGreeting() {

        String message = "Welcome to the world of REST APIs in Java!";

        return Response.status(200).entity(message).build();
    }

}

// To deploy to older Tomcat versions
// Replace jakarta with javax