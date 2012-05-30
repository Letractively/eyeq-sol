/**
 * 
 * JPA Annotaion SecondaryTable 에 대한 테스트
 * SecondaryTable(줄여서 ST) 는 관계 테이블의 Entity 를 따로 만들필요없이
 * Annotaion 의 속성에 따라 자동으로 테이블 생성을 해줌.
 * 
 */

package com.sol.eyeq.model.domain.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
@SecondaryTable(name = "Student_ADDRESS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "Student_ID"))
public class SecondaryTableStudent {
	@Id
	private int id;
	private String name;

	@Column(table = "Student_ADDRESS")
	private String street;
	@Column(table = "Student_ADDRESS")
	private String city;
	@Column(table = "Student_ADDRESS")
	private String state;
	@Column(name = "ZIP_CODE", table = "Student_ADDRESS")
	private String zip;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String toString() {
		return "Student id: " + getId() + " name: " + getName();
	}
}
