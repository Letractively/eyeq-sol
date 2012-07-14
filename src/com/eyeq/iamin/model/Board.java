package com.eyeq.iamin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BOARD")
public class Board {

	@Id
	@GeneratedValue
	private Integer boardSeq;

	@ManyToOne
	@JoinColumn(name = "ROOM_SEQ", insertable = true, updatable = true)
	private Room room;

	@Column(length = 20)
	private String nickName;

	// Mysql
	// @Column(columnDefinition="TEXT (4000)")
	// 기타
	@Column(columnDefinition = "CLOB NOT NULL")
	@Lob
	private String content;

	@Column(name = "REG_DATE")
	@Temporal(TemporalType.DATE)
	private Date regDate;

	/**
	 * @return the boardSeq
	 */
	public Integer getBoardSeq() {
		return boardSeq;
	}

	/**
	 * @param boardSeq
	 *            the boardSeq to set
	 */
	public void setBoardSeq(Integer boardSeq) {
		this.boardSeq = boardSeq;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room
	 *            the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName
	 *            the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the regDate
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate
	 *            the regDate to set
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
