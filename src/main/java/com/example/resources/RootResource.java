package com.example.resources;

import static javax.ws.rs.core.UriBuilder.fromPath;
import static com.example.resources.ResourceHelper.defaultLinksBuilder;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.example.representation.BaseRepresentation;
import com.example.util.LinksBuilder;

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
	public final BaseRepresentation get(@Context UriInfo uriInfo) {
		LinksBuilder linksBuilder = defaultLinksBuilder(uriInfo).add("example",
				fromPath("example").build(new Object[] {}));
		return new BaseRepresentation(linksBuilder);

	}
}
