package com.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/resource")
public class Resource {

	@GET
    @Path("/list")
    public String list() {
        return "success";
    }

    @GET
    @Path("/say/{msg}")
    public void putTest(@PathParam(value = "msg") String msg) {
        System.out.println("receive success : " + msg);
    }
	
}
