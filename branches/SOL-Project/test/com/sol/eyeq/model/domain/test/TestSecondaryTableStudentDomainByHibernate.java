package com.sol.eyeq.model.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSecondaryTableStudentDomainByHibernate {

	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		try {
			sessionFactory = cfg.configure().addAnnotatedClass(SecondaryTableStudent.class)
					.buildSessionFactory(sr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserDomain() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		SecondaryTableStudent user = new SecondaryTableStudent();
		user.setCity("부산");
		user.setName("이하나");
		user.setState("사하구");
		user.setStreet("길동");
		user.setZip("123-123");

		try {
			session.persist(user);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println("end");
	}

}
