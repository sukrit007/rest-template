package com.example.util;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriInfo;

import com.example.representation.Link;
import com.google.common.collect.ImmutableMap;

public class LinksBuilder {

	private List<Link> links = new ArrayList<>();
	private URI baseUri;

	public LinksBuilder(URI baseUri) {
		this.baseUri = baseUri;
	}

	public LinksBuilder add(String name, URI href) {
		String resolvedUriString = baseUri.resolve(href).toASCIIString();
		links.add(new Link(name, resolvedUriString));
		return this;
	}

	public List<Link> build() {
		return links;
	}
	
	public static LinksBuilder from(UriInfo uriInfo) {
		return new LinksBuilder(uriInfo.getBaseUri());
	}

}
