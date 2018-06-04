package com.abhi.res;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myapp")
public class MyApi {
    @GET
    @Path("/say")
    @Produces(MediaType.TEXT_PLAIN)
    public String say() {
        System.out.printf("sssssss");
        return "Hello Jersey";
    }

}
