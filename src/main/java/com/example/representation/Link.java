package com.example.representation;

public class Link {

	private String rel;
	private String href;

	public Link(String rel, String href) {
		super();
		this.rel = rel;
		this.href = href;
	}

	public String getRel() {
		return rel;
	}

	public String getHref() {
		return href;
	}

}
