package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

/**
 * This class initializes Guice.
 * 
 * @author Sukrit Khera
 * 
 */
@WebListener
public class AppServletConfig extends GuiceServletContextListener {

	/**
	 * Logger object.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(AppServletConfig.class);

	@Override
	protected final Injector getInjector() {

		return Guice.createInjector(new ServletModule() {

			@Override
			protected void configureServlets() {
				// super.configureServlets();
				logger.debug("In guice:: configureServlets::");
				Map<String, String> params = new HashMap<String, String>();
				params.put(PackagesResourceConfig.PROPERTY_PACKAGES,
						"com.example.resources");
				params.put("com.sun.jersey.api.json.POJOMappingFeature",
						"true");
				serve("/api/*").with(GuiceContainer.class, params);
				

			}

		});
	}
}
