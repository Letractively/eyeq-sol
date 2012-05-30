package com.sol.eyeq.model.service.test;

import java.util.List;

import org.hibernate.SessionFactory;

import com.sol.eyeq.model.domain.test.ManyToOneDepartment;
import com.sol.eyeq.model.domain.test.ManyToOneProfessor;

public interface ManyToOneProfessorDao {

	/**
	 * @return the sessionFactory
	 */
	public abstract SessionFactory getSessionFactory();

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public abstract void setSessionFactory(SessionFactory sessionFactory);

	public abstract ManyToOneProfessor createProfessor(String name, long salary);

	public abstract ManyToOneProfessor setProfessorDepartment(int empId,
			int deptId);

	public abstract List<ManyToOneProfessor> findAllProfessors();

	public abstract ManyToOneDepartment createDepartment(String name);

	public abstract List<ManyToOneDepartment> findAllDepartments();

}