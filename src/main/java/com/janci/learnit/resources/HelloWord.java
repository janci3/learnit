package com.janci.learnit.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWord {
	@GET
	public String hello(){
		return "hello word";
	}

}
