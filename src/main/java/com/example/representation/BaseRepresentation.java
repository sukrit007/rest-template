package com.example.representation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

import com.example.util.LinksBuilder;

public class BaseRepresentation {

	private List<Link> links = new ArrayList<>();
	
	

	public List<Link> getLinks() {
		return links;
	}



	public BaseRepresentation(LinksBuilder builder) {
		super();
		this.links = builder.build();
	}

}
