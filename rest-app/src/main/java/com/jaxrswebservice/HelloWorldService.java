package com.jaxrswebservice;

import jakarta.ws.rs.GET; // @interface GET
import jakarta.ws.rs.Path; // @interface Path
import jakarta.ws.rs.core.Response; // abstract class Response

@Path("/greeting")
public class HelloWorldService {

    @GET
    public String myGreeting() {

        return "Welcome to the world of REST APIs in Java!";
    }

}

// To deploy to older Tomcat versions
// Replace jakarta with javax