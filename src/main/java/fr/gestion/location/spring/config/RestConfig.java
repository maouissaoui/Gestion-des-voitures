package fr.gestion.location.spring.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@ApplicationPath("api")
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        packages("fr.gestion.location.rest");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        //jackson pour la sérialisation/désérialisation d’objets de et vers le format JSON
        register(JacksonJsonProvider.class);
        register(JacksonFeature.class);
        register(CORSResponseFilter.class);
     // Enable Tracing support.
        property(ServerProperties.TRACING, "ALL");
    }
}