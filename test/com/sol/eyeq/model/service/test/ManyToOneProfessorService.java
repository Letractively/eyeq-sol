package com.sol.eyeq.model.service.test;

import java.util.List;

import org.hibernate.SessionFactory;

import com.sol.eyeq.model.domain.test.ManyToOneDepartment;
import com.sol.eyeq.model.domain.test.ManyToOneProfessor;

public class ManyToOneProfessorService implements ManyToOneProfessorDao {

	private SessionFactory sessionFactory;

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#getSessionFactory()
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#setSessionFactory(org.hibernate.SessionFactory)
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public ManyToOneProfessorService(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#createProfessor(java.lang.String,
	 *      long)
	 */
	public ManyToOneProfessor createProfessor(String name, long salary) {
		ManyToOneProfessor emp = new ManyToOneProfessor();
		emp.setName(name);
		emp.setSalary(salary);
		getSessionFactory().getCurrentSession().persist(emp);
		return emp;
	}

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#setProfessorDepartment(int,
	 *      int)
	 */
	public ManyToOneProfessor setProfessorDepartment(int empId, int deptId) {
		ManyToOneProfessor emp = (ManyToOneProfessor) getSessionFactory()
				.getCurrentSession()
				.createQuery("from ManyToOneProfessor where id=?")
				.setParameter(0, empId).list().get(0);
		ManyToOneDepartment dept = (ManyToOneDepartment) getSessionFactory()
				.getCurrentSession()
				.createQuery("from ManyToOneDepartment where id=?")
				.setParameter(0, deptId).list().get(0);
		emp.setDepartment(dept);
		return emp;
	}

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#findAllProfessors()
	 */
	public List<ManyToOneProfessor> findAllProfessors() {
		@SuppressWarnings("unchecked")
		List<ManyToOneProfessor> professors = getSessionFactory()
				.getCurrentSession().createQuery("from ManyToOneProfessor")
				.list();
		return professors;
	}

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#createDepartment(java.lang.String)
	 */
	public ManyToOneDepartment createDepartment(String name) {
		ManyToOneDepartment dept = new ManyToOneDepartment();
		dept.setName(name);
		getSessionFactory().getCurrentSession().persist(dept);
		return dept;
	}

	/**
	 * @see com.sol.eyeq.model.service.test.ManyToOneProfessorDao#findAllDepartments()
	 */
	public List<ManyToOneDepartment> findAllDepartments() {
		@SuppressWarnings("unchecked")
		List<ManyToOneDepartment> departments = getSessionFactory()
				.getCurrentSession().createQuery("from ManyToOneDepartment")
				.list();
		return departments;
	}
}
