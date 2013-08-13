package com.example.resources;

import javax.ws.rs.core.UriInfo;

import com.example.util.LinksBuilder;

public class ResourceHelper {

	public static final LinksBuilder defaultLinksBuilder(UriInfo uriInfo) {
		LinksBuilder builder = new LinksBuilder(uriInfo.getBaseUri());
		builder.add("self", uriInfo.getRequestUri());
		return builder;
	}

}
