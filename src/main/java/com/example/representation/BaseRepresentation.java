package com.example.representation;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

import com.example.util.LinksBuilder;

public class BaseRepresentation {

	private Map<String, Map<String, String>> links = new HashMap<>();

	@JsonProperty("_links")
	public Map<String, Map<String, String>> getLinks() {
		return links;
	}

	public BaseRepresentation(LinksBuilder builder) {
		super();
		this.links = builder.build();
	}

}
