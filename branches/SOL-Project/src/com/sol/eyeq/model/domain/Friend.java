package com.sol.eyeq.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Friend {

	@ManyToOne
	@JoinColumn(name = "USER_SEQ", insertable = true, updatable = true)
	private User user;

	@Column(name = "FRIEND_SEQ")
	private String friendSeq;

	@Column(name = "IS_FRIEND")
	private Boolean isFriend;

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
	 * @return the friendSeq
	 */
	public String getFriendSeq() {
		return friendSeq;
	}

	/**
	 * @param friendSeq
	 *            the friendSeq to set
	 */
	public void setFriendSeq(String friendSeq) {
		this.friendSeq = friendSeq;
	}

	/**
	 * @return the isFriend
	 */
	public Boolean getIsFriend() {
		return isFriend;
	}

	/**
	 * @param isFriend
	 *            the isFriend to set
	 */
	public void setIsFriend(Boolean isFriend) {
		this.isFriend = isFriend;
	}

}
