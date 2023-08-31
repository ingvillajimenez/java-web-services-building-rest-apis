package com.jaxrswebservice;

import jakarta.ws.rs.GET; // @interface GET
import jakarta.ws.rs.Path; // @interface Path
import jakarta.ws.rs.PathParam; // @interface PathParam
import jakarta.ws.rs.Produces; // @interface Produces
import jakarta.ws.rs.core.MediaType; // class MediaType
import jakarta.ws.rs.core.Response; // abstract class Response

@Path("/ws")
public class HelloWorldService {

    @GET
    @Path("/greeting")
    @Produces(MediaType.TEXT_HTML)
    public String myGreeting() {

        return "Welcome to the world of <b>REST APIs in Java!</b>";
    }

    @GET
    @Path("/greeting/{param}")
    public Response myGreeting(@PathParam("param") String name) {

        String message = "Welcome <b>" + name + "!</b> This is the world of web services.";

        return Response.status(200)
                .entity(message)
                .type(MediaType.TEXT_HTML)
                .build();

    }
}

// To deploy to older Tomcat versions
// Replace jakarta with javax