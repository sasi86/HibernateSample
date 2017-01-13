package com.sasi.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass {
	
	private static Session session;
	private static SessionFactory sessionFactory;
	private static Configuration configuration;
	private static ServiceRegistry reg;
	
	static{
		configuration = new Configuration().configure();
		reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(reg);
		
	}
	
	public static void main(String[] args) {
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		Country c = (Country)session.load(Country.class,"AFG");
		
		System.out.println(c.getName() + " has population of "+ c.getPopulation());
		System.out.println("Has the following cities"+c.getCities().size());
		for(City c1 : c.getCities()){
			System.out.println(c1.getName());
		}
		session.close();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

}
