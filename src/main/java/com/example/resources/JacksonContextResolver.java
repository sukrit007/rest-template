package com.example.resources;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 * This class configures pretty print for Jackson.
 * 
 * @author Sukrit
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonContextResolver implements ContextResolver<ObjectMapper> {
	/**
	 * {@link ObjectMapper} object.
	 */
	private ObjectMapper objectMapper;

	/**
	 * Constructor.
	 * 
	 * @throws Exception
	 *             if it fails to configure.
	 */
	public JacksonContextResolver() throws Exception {
		this.objectMapper = new ObjectMapper();
		this.objectMapper
			.configure(
					DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
					false).configure(
						SerializationConfig.Feature.INDENT_OUTPUT, true);
	}

	/**
	 * Gets the object mapper context.
	 * 
	 * @param objectType
	 *            Class representing object type.
	 * @return {@link ObjectMapper} object.
	 */
	@Override
	public final ObjectMapper getContext(final Class<?> objectType) {
		return objectMapper;
	}
}