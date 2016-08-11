package fr.gestion.location.spring.config;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

/**
 * Les filtres permettant de réaliser des traitements spécifiques sur toutes les
 * requêtes comme par exemple ajouter des headers CORS pour autoriser n’importe
 * quelle application hébergée sur un autre domaine d’utiliser notre API. Pour
 * réaliser un filtre avec Jersey, il suffit de créer une classe implémentant
 * ContainerRequestFilter et/ou ContainerResponseFilter, comme dans l’exemple
 * ci-dessous. Pour enregistrer le filtre, il y a deux possibilités : l’annoter
 * avec @Provider ou bien l’ajouter dans la configuration Jersey en utilisant la
 * méthode register(MyFilter.class).
 * 
 * @author Aouissaoui
 *
 */
@Provider
@PreMatching
public class CORSResponseFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");

		responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
		responseContext.getHeaders().add("Access-Control-Allow-Methods",
				"GET, POST, DELETE, PUT, OPTIONS, X-XSRF-TOKEN");
		responseContext.getHeaders().add("Access-Control-Allow-Headers",
				"Cache-Control, Pragma, Origin, Authorization, Content-Type, X-Requested-With");
	}
}