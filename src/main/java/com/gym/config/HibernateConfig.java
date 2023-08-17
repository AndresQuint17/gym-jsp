package com.gym.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean  sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(comboPooledDataSource());
		sessionFactory.setPackagesToScan("com.gym.entities");
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}
	
	//Configuración del pool de conexiones con c3p0
	@Bean
	public DataSource comboPooledDataSource() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			//Establecer conexión a BBDD
			ds.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(IllegalStateException | PropertyVetoException ex) {
			throw new RuntimeException("error while setting the driver class name in the datasource", ex);
		}
		ds.setJdbcUrl("jdbc:sqlserver://localhost:1433;trustServerCertificate=true;encrypt=false;databaseName=GymJSP");
		ds.setUser("sa");
		ds.setPassword("12345678");
		
		ds.setInitialPoolSize(5);
		ds.setMinPoolSize(5);
		ds.setMaxPoolSize(20);
		ds.setAcquireIncrement(5);
		ds.setMaxIdleTime(30000);
		return ds;
	}
	
	@Bean
	public PlatformTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	
	private final Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibertane.dialect", "org.hibernate.dialect.SQLServer2012Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		return hibernateProperties;
	}

}
