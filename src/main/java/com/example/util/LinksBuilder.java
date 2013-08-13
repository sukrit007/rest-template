package com.example.util;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class LinksBuilder {

	private Map<String, Map<String, String>> links = new HashMap<>();
	private URI baseUri;

	public LinksBuilder(URI baseUri) {
		this.baseUri = baseUri;
	}

	public LinksBuilder add(String name, URI href) {
		String resolvedUriString = baseUri.resolve(href).toASCIIString();

		links.put(
				name,
				new ImmutableMap.Builder<String, String>().put("href",
						resolvedUriString).build());
		return this;
	}

	public Map<String, Map<String, String>> build() {
		return links;
	}

}
