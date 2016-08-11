package fr.gestion.location.spring.config;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

import org.glassfish.jersey.CommonProperties;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class JacksonFeature implements Feature {

	public boolean configure(final FeatureContext context) {

		String postfix = '.' + context.getConfiguration().getRuntimeType().name().toLowerCase();

		context.property(CommonProperties.MOXY_JSON_FEATURE_DISABLE + postfix, true);

		context.register(JacksonJsonProvider.class, MessageBodyReader.class, MessageBodyWriter.class);

		return true;
	}

}
