package com.janci.learnit.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.janci.learnit.entities.TestEntity;
import com.janci.learnit.services.HelloService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
public class HelloWord {
	HelloService helloService = new HelloService();
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(){
		return "hello word";
	}
	
	@GET
	@Path("/entity/{entityId}")
	@Produces(MediaType.APPLICATION_JSON)
	public TestEntity getTestEntity(@PathParam("entityId") int id){
		return helloService.getTestEntity(id);
	}
	
	@POST
	@Path("/entity")
	public TestEntity saveTestEntity(TestEntity entity){
		return helloService.saveTestEntity(entity);
	}

}
