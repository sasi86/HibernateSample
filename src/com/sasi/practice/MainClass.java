package com.sasi.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.sasi.entity.UserDetails;
import com.sasi.entity.Vehicle;

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
		UserDetails user = new UserDetails();
		user.setName("Sasi");
		Vehicle vehicle = new Vehicle();
		vehicle.setName("car");
		user.getVechicle().add(vehicle);
		vehicle.setUser(user);
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		
	}
	
	private void get(){
		Country c = (Country)session.load(Country.class,"AFG");
		System.out.println(c.getName() + " has population of "+ c.getPopulation());
		System.out.println("Has the following cities"+c.getCities().size());
		for(City c1 : c.getCities()){
			System.out.println(c1.getName());
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

}
