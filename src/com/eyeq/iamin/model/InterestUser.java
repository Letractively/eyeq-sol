package com.eyeq.iamin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INTEREST_USER")
public class InterestUser {

	@ManyToOne
	@JoinColumn(name = "USER_SEQ", insertable = true, updatable = true)
	private User user;

	@Column(name = "INTEREST_USER")
	private String interestUser;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the interestUser
	 */
	public String getInterestUser() {
		return interestUser;
	}

	/**
	 * @param interestUser
	 *            the interestUser to set
	 */
	public void setInterestUser(String interestUser) {
		this.interestUser = interestUser;
	}

}
