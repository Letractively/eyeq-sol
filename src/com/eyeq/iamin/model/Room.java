package com.eyeq.iamin.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Room {

	@Id
	@GeneratedValue
	@Column(name = "ROOM_SEQ")
	private Integer roomSeq;

	@Column(name = "ROOM_NAME", length = 30)
	private String roomName;

	@ManyToOne
	@JoinColumn(name = "CATE_SEQ")
	private Category category;

	@Column(length = 20)
	private String owner;

	@Column(length = 100)
	private String roomDescribe;

	@Column(name = "PUBLISHES", length = 20)
	private String publishes;

	@Column(length = 20)
	private String location;

	@Column(name = "MAX_PEOPLE")
	private Integer maxPeople;

	@Column(name = "REG_DATE")
	@Temporal(TemporalType.DATE)
	private Date regDate;

	@Column(name = "RECRUITMENT_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date recruitmentEndDate;

	@Column(name = "STUDY_START_DATE")
	@Temporal(TemporalType.DATE)
	private Date studyStartDate;

	@Column(name = "STUDY_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date studyEndDate;

	private Integer hits;

	@OneToMany(targetEntity = Board.class, mappedBy = "room", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Board> boards;

	@ManyToMany
	@JoinTable(name = "JOIN_ROOM_USER", joinColumns = { @JoinColumn(name = "room_Seq") }, inverseJoinColumns = { @JoinColumn(name = "user_Seq") })
	private List<User> users;

	/**
	 * @return the roomSeq
	 */
	public Integer getRoomSeq() {
		return roomSeq;
	}

	/**
	 * @param roomSeq
	 *            the roomSeq to set
	 */
	public void setRoomSeq(Integer roomSeq) {
		this.roomSeq = roomSeq;
	}

	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName
	 *            the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the roomDescribe
	 */
	public String getRoomDescribe() {
		return roomDescribe;
	}

	/**
	 * @param roomDescribe
	 *            the roomDescribe to set
	 */
	public void setRoomDescribe(String roomDescribe) {
		this.roomDescribe = roomDescribe;
	}

	/**
	 * @return the publishes
	 */
	public String getPublishes() {
		return publishes;
	}

	/**
	 * @param publishes
	 *            the publishes to set
	 */
	public void setPublishes(String publishes) {
		this.publishes = publishes;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the maxPeople
	 */
	public Integer getMaxPeople() {
		return maxPeople;
	}

	/**
	 * @param maxPeople
	 *            the maxPeople to set
	 */
	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
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

	/**
	 * @return the hits
	 */
	public Integer getHits() {
		return hits;
	}

	/**
	 * @param hits
	 *            the hits to set
	 */
	public void setHits(Integer hits) {
		this.hits = hits;
	}

	/**
	 * @return the boards
	 */
	public List<Board> getBoards() {
		return boards;
	}

	/**
	 * @param boards
	 *            the boards to set
	 */
	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}

	/**
	 * @return the recruitmentEndDate
	 */
	public Date getRecruitmentEndDate() {
		return recruitmentEndDate;
	}

	/**
	 * @param recruitmentEndDate
	 *            the recruitmentEndDate to set
	 */
	public void setRecruitmentEndDate(Date recruitmentEndDate) {
		this.recruitmentEndDate = recruitmentEndDate;
	}

	/**
	 * @return the studyStartDate
	 */
	public Date getStudyStartDate() {
		return studyStartDate;
	}

	/**
	 * @param studyStartDate
	 *            the studyStartDate to set
	 */
	public void setStudyStartDate(Date studyStartDate) {
		this.studyStartDate = studyStartDate;
	}

	/**
	 * @return the studyEndDate
	 */
	public Date getStudyEndDate() {
		return studyEndDate;
	}

	/**
	 * @param studyEndDate
	 *            the studyEndDate to set
	 */
	public void setStudyEndDate(Date studyEndDate) {
		this.studyEndDate = studyEndDate;
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
