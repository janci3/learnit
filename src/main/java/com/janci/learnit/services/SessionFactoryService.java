package com.janci.learnit.services;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryService {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public static SessionFactory buildSessionFactory(){
		 Configuration configuration = new Configuration();
		
		    configuration.configure();
		    serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		            configuration.getProperties()).build();
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		    return sessionFactory;
	}
}
