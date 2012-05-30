/**
 * ManyToOne 현재 테이블의 Entity 가 대상 테이블 Entity 하나에 매칭
 * OneToMany 는 반대의 개념. 대신 OneToMany 가 붙는 Annotaion 은 List 여야 한다.
 */
package com.sol.eyeq.model.domain.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ManyToOneProfessor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long salary;

	@ManyToOne
	@JoinColumn(name = "DEPT_ID") //Professor 테이블에 생성될 FK 컬럼명
	private ManyToOneDepartment department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public ManyToOneDepartment getDepartment() {
		return department;
	}

	public void setDepartment(ManyToOneDepartment department) {
		this.department = department;
	}

	public String toString() {
		return "Professor id: " + getId() + " name: " + getName() + " with "
				+ getDepartment();
	}
}
