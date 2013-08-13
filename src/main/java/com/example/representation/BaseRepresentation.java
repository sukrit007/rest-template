package com.example.representation;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.example.util.LinksBuilder;

public class BaseRepresentation {

	private LinksBuilder linksBuilder;

	public List<Link> getLinks() {
		return linksBuilder.build();
	}

	public BaseRepresentation(LinksBuilder builder) {
		super();
		this.linksBuilder = builder;
	}

	@JsonIgnore
	public LinksBuilder getLinksBuilder() {
		return linksBuilder;
	}

}
