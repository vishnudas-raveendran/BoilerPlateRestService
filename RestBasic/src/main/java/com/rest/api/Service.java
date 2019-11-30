package com.rest.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/service/v0.1")
public class Service {

    @GET
    public String defaultGet() {
        return "Default get";
    }

    @GET
    @Path("/testService")
    public String testService() {
        return "Service works !! ";
    }

    @GET
    @Path("/hello/{name}")
    public String helloWorld(@PathParam("name") String name) {
        return "Hello " + name;
    }


}