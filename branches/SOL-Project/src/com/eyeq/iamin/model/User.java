package com.eyeq.iamin.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.eyeq.iamin.model.type.GenderType;

/**
 * User를 하나로 가져가서 필수랑 선택값.
 * 
 * */

@Entity
@Table(name = "study_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_seq")
	private Long seq;

	@NotNull
	@Column(unique = true)
	@Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")
	private String email;

	@NotNull
	@Column(unique = true, name = "nickname")
	@Size(min = 1, max = 30)
	private String nickName;

	@NotNull
	@Column(name = "name")
	@Size(min = 1, max = 30)
	private String name;

	@NotNull
	@Size(min = 1, max = 20)
	private String password;

	@NotNull
	@Column(name = "birth_date")
	@Temporal(TemporalType.DATE)
	private Date birthday;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "gender", length = 1)
	private GenderType gender;

	@NotNull
	@Column(name = "reg_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "mod_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	@Column(name = "like_category")
	private String likeCategory;

	@Column(name = "like_room")
	private String likeRoom;

	private Integer grade;

	@OneToMany(targetEntity = Friend.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Friend> friends;

	@ManyToMany
	@JoinTable(name = "JOIN_ROOM_USER", joinColumns = { @JoinColumn(name = "user_Seq") }, inverseJoinColumns = { @JoinColumn(name = "room_Seq") })
	private List<Room> rooms;

	/**
	 * @return the seq
	 */
	public Long getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *            the seq to set
	 */
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthDay
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public GenderType getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the Gender to set
	 */
	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the likeCategory
	 */
	public String getLikeCategory() {
		return likeCategory;
	}

	/**
	 * @param likeCategory
	 *            the likeCategory to set
	 */
	public void setLikeCategory(String likeCategory) {
		this.likeCategory = likeCategory;
	}

	/**
	 * @return the likeRoom
	 */
	public String getLikeRoom() {
		return likeRoom;
	}

	/**
	 * @param likeRoom
	 *            the likeRoom to set
	 */
	public void setLikeRoom(String likeRoom) {
		this.likeRoom = likeRoom;
	}

	/**
	 * @return the grade
	 */
	public Integer getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	/**
	 * @return the rooms
	 */
	public List<Room> getRooms() {
		return rooms;
	}

	/**
	 * @param rooms
	 *            the rooms to set
	 */
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * @return the friends
	 */
	public List<Friend> getFriends() {
		return friends;
	}

	/**
	 * @param friends
	 *            the friends to set
	 */
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

}
