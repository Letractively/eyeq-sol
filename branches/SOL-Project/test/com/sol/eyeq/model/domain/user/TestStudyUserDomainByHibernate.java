package com.sol.eyeq.model.domain.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.eyeq.iamin.model.domain.User;
import com.eyeq.iamin.model.type.UserGenderType;

public class TestStudyUserDomainByHibernate {

	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		Configuration cfg = new Configuration();
		cfg.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		try {
			sessionFactory = cfg.configure().addAnnotatedClass(User.class)
					.buildSessionFactory(sr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserDomain() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setBirthDay(new Date());
		user.setCreateDate(new Date());
		user.setUserName("이하나");
		user.setEmail("voyaging@eyeq.co.kr");
		user.setPassword("dlgksk");
		user.setConfirmPassword("dlgksk");
		user.setNickName("겨울나무");
		user.setUserGender(UserGenderType.M);

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
