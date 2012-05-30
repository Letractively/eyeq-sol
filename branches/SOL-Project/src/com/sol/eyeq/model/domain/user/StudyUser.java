package com.sol.eyeq.model.domain.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sol.eyeq.model.type.UserGenderType;

@Entity
@Table(name = "user")
public class StudyUser implements Serializable {

	private static final long serialVersionUID = -4770542413362350985L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_seq")
	private Long userSeq;

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
	private String userName;

	@NotNull
	@Size(min = 1, max = 20)
	private String password;

	@NotNull
	@Transient
	private String confirmPassword;

	@NotNull
	@Column(name = "birth_date")
	@Temporal(TemporalType.DATE)
	private Date birthDay;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "gender", length = 1)
	private UserGenderType userGender;

	@NotNull
	@Column(name = "reg_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "mod_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	/**
	 * 기본 생성자
	 */
	public StudyUser() {
	}

	/**
	 * @param email
	 * @param nickName
	 * @param userName
	 * @param password
	 * @param birthDay
	 * @param userSex
	 * @param createDate
	 * @param modifiedDate
	 */
	public StudyUser(String email, String nickName, String userName,
			String password, Date birthDay, UserGenderType userSex,
			Date createDate, Date modifiedDate) {
		super();
		this.email = email;
		this.nickName = nickName;
		this.userName = userName;
		this.password = password;
		this.birthDay = birthDay;
		this.userGender = userSex;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword
	 *            the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay
	 *            the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the userSex
	 */
	public UserGenderType getUserGender() {
		return userGender;
	}

	/**
	 * @param userGender
	 *            the userSex to set
	 */
	public void setUserGender(UserGenderType userGender) {
		this.userGender = userGender;
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
	 * @return the userId
	 */
	public long getUserSeq() {
		return userSeq;
	}

}
