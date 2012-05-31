package com.sol.eyeq.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class StudyRoom {

	@Id
	private Long roomSeq;

	/**
	 * @return the roomSeq
	 */
	public Long getRoomSeq() {
		return roomSeq;
	}

	/**
	 * @param roomSeq
	 *            the roomSeq to set
	 */
	public void setRoomSeq(Long roomSeq) {
		this.roomSeq = roomSeq;
	}

}
