package fr.gestion.location.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Classe de configuration
 * 
 * @author maouissaoui
 *
 */

// Specifies that there will be bean methods annotated with @Bean tag
// and will be managed by Spring
@Configuration
// Equivalent to Spring's tx in the xml
@EnableTransactionManagement

// Equivalent to context:component-scan base-package="..." in the xml, states
// where to find the beans controlled by Spring
@ComponentScan(basePackages = { "fr.gestion.location.spring.config" })

// Here it can be stated some Spring properties with a properties file
@PropertySource({ "classpath:/application.properties" })
public class HibernateConfiguration {

	 /**
     * Injected by Spring based on the .properties file in the
     * \@PropertySource tag.
     */
	@Autowired
	private Environment environment;

	 /**
     * Here it's created a Session Factory, equivalent to the Spring's config file one.
     *
     * @return Spring Session factory
     */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		// Uses the datasource
		sessionFactory.setDataSource(dataSource());
		
		 // Indicates where are the POJOs (DTO)
		sessionFactory.setPackagesToScan(new String[] { "fr.gestion.location.spring.entity" });
		// Se asignan las propietes de Hibernate
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	 
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return dataSource;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
//		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

}
