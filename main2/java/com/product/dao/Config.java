package com.product.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Config {

	
	public static SessionFactory hibConfig() {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();		
		//Metadata in the config file should be executed		
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();	
		//go to session factory and execute the meta data
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		return sf;
	}

}
