package com.sol.eyeq.model.domain.test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sol.eyeq.model.service.test.ManyToOneProfessorService;

public class TestManyToOneProfessorDomainByHibernate {

	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		Configuration cfg = new Configuration();
		cfg.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		try {
			sessionFactory = cfg.configure()
					.addAnnotatedClass(ManyToOneProfessor.class)
					.addAnnotatedClass(ManyToOneDepartment.class)
					.buildSessionFactory(sr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserDomain() {
		try {
			Transaction tx = sessionFactory.getCurrentSession()
					.beginTransaction();

			ManyToOneProfessorService service = new ManyToOneProfessorService(
					sessionFactory);
			ManyToOneProfessor user1 = service.createProfessor("이하나1", 100);
			ManyToOneProfessor user2 = service.createProfessor("이하나2", 200);
			ManyToOneProfessor user3 = service.createProfessor("이하나3", 300);
			ManyToOneProfessor user4 = service.createProfessor("이하나4", 400);
			ManyToOneDepartment dept1 = service.createDepartment("개발1팀");
			ManyToOneDepartment dept2 = service.createDepartment("개발2팀");

			service.setProfessorDepartment(user1.getId(), dept1.getId());
			service.setProfessorDepartment(user2.getId(), dept1.getId());
			service.setProfessorDepartment(user3.getId(), dept2.getId());
			service.setProfessorDepartment(user4.getId(), dept2.getId());

			// List<ManyToOneProfessor> users = service.findAllProfessors();
			// List<ManyToOneDepartment> depts = service.findAllDepartments();

			tx.commit();

			assertThat(user1.getName(), is(equalTo("이하나1")));
			assertThat(user1.getSalary(), is(equalTo(100L)));

			assertThat(user2.getName(), is(equalTo("이하나2")));
			assertThat(user2.getSalary(), is(equalTo(200L)));

			assertThat(user3.getName(), is(equalTo("이하나3")));
			assertThat(user3.getSalary(), is(equalTo(300L)));

			assertThat(user4.getName(), is(equalTo("이하나4")));
			assertThat(user4.getSalary(), is(equalTo(400L)));

			assertThat(dept1.getName(), is(equalTo("개발1팀")));
			assertThat(dept2.getName(), is(equalTo("개발2팀")));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}
}
