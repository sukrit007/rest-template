package com.example.resources;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * This defines root resource for the application.
 * 
 * @author sukrit
 * 
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Singleton
public class RootResource {

	/**
	 * Returns paths for root resource.
	 * 
	 * @return {@link String}
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public final Map<String, String> get() {
		Map<String, String> links = new HashMap<>();
		links.put("self", "/");
		links.put("example", "/api/example");
		return links;
	}
}
