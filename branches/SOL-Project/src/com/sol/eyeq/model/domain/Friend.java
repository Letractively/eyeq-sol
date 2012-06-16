package com.sol.eyeq.model.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Friend {

	@ManyToOne
	@JoinColumn(name = "USER_SEQ", insertable = true, updatable = true)
	private User user;

	private String friend;

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
	 * @return the friend
	 */
	public String getFriend() {
		return friend;
	}

	/**
	 * @param friend
	 *            the friend to set
	 */
	public void setFriend(String friend) {
		this.friend = friend;
	}

}
