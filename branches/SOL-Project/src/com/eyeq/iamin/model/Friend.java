package com.eyeq.iamin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Friend {

	@Id
	@GeneratedValue
	private Integer friendSeq;

	@ManyToOne
	@JoinColumn(name = "USER_SEQ", insertable = true, updatable = true)
	private User user;

	@Column(name = "FRIEND_USER_SEQ")
	private Integer friendUserSeq;

	@Column(name = "IS_FRIEND")
	private Boolean isFriend;

	/**
	 * @return the friendSeq
	 */
	public Integer getFriendSeq() {
		return friendSeq;
	}

	/**
	 * @param friendSeq
	 *            the friendSeq to set
	 */
	public void setFriendSeq(Integer friendSeq) {
		this.friendSeq = friendSeq;
	}

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
	 * @return the friendUserSeq
	 */
	public Integer getFriendUserSeq() {
		return friendUserSeq;
	}

	/**
	 * @param friendUserSeq
	 *            the friendUserSeq to set
	 */
	public void setFriendUserSeq(Integer friendUserSeq) {
		this.friendUserSeq = friendUserSeq;
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
