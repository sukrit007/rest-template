package com.example;

import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

@WebListener
public class AppServletConfig extends GuiceServletContextListener {

	private static final Logger logger = LoggerFactory
			.getLogger(AppServletConfig.class);

	@Override
	protected Injector getInjector() {

		return Guice.createInjector(new ServletModule() {

			@Override
			protected void configureServlets() {
				logger.info("In guice:: configureServlets::");
				serve("/api/*").with(GuiceContainer.class);
				super.configureServlets();
			}

		});
	}
}
