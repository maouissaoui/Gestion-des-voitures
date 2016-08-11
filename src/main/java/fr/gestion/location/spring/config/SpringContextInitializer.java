package fr.gestion.location.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Maintenant, il faut déclarer une classe héritant de WebApplicationInitializer. 
 * Ensuite, si au démarrage, nous avons un composant qui cherche le fichier
 * applicationContext.xml, c’est qu’il y a une initialisation du contexte Spring
 * de faite quelque part. En fouillant un peu, on se rend compte que jersey
 * propose une implémentation par défaut pour instancier le contexte Spring. Le
 * problème est que cette classe scanne le classpath pour trouver le fichier
 * applicationContext.xml que nous ne souhaitons pas. Pour pallier à ce
 * problème, nous allons instancier notre propre contexte qui va utiliser la
 * configuration se trouvant dans le package config et qui se chargera à la
 * place du contexte par défaut grâce à l’annotation @Order(HIGHEST_PRECEDENCE).
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SpringContextInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("contextConfigLocation", "fr.gestion.location.spring.config");
		WebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
		if (rootAppContext != null) {
			servletContext.addListener(new ContextLoaderListener(rootAppContext));
		}
	}

}
