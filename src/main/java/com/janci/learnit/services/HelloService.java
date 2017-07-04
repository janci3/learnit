package com.janci.learnit.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.janci.learnit.entities.TestEntity;

import static com.janci.learnit.services.SessionFactoryService.buildSessionFactory;


public class HelloService {

	SessionFactory factory = buildSessionFactory();
	
	public TestEntity getTestEntity(int id){
		Session session = factory.openSession();
		TestEntity entity = null;
		try {
			entity = (TestEntity) session.get(TestEntity.class, id);
		} finally {
			session.close();
		}
		return entity;
	}
	public TestEntity saveTestEntity(TestEntity entity){
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		} catch(Exception e) {
		if (session.getTransaction() != null) session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return entity;
	}
}
