package com.sol.eyeq.model.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestOneToOneStudentDomainByHibernate {

	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		Configuration cfg = new Configuration();
		cfg.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		try {
			sessionFactory = cfg.configure().addAnnotatedClass(OneToOneStudent.class)
					.addAnnotatedClass(OneToOneAddress.class).buildSessionFactory(sr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserDomain() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		OneToOneStudent user = new OneToOneStudent();
		OneToOneAddress addr = new OneToOneAddress();

		/*addr.setState("서울시");
		addr.setCity("송파구");
		addr.setStreet("풍납동");
		addr.setZip("123-456");*/

		user.setName("이하나");
		user.setAddress(addr);

		try {
			session.update(user);
			session.update(addr);
			//session.persist(user);
			//session.persist(addr);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println("end");
	}

}
