package fr.gestion.location.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Specifies that there will be bean methods annotated with @Bean tag
//and will be managed by Spring
/**
 * @author aouissaoui
 *
 */
@Configuration

// Equivalent to context:component-scan base-package="..." in the xml, states
// where to find the beans controlled by Spring
@ComponentScan( basePackages = {        
	    "fr.gestion.location.spring.serivce",
	    "fr.gestion.location.spring.dao"
	})
public class SpringConfig {

	/**
	 * Where will the project views be.
	 *
	 * @return ViewResolver como el XML
	 */
	// @Bean
	// public ViewResolver viewResolver() {
	// InternalResourceViewResolver viewResolver = new
	// InternalResourceViewResolver();
	// return viewResolver;
	// }

}
