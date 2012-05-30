package com.sol.eyeq.model.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sol.eyeq.model.domain.category.StudyCategory;
import com.sol.eyeq.model.domain.room.StudyRoom;

@Entity
@Table(name = "user_detail")
public class StudyUserDetail {

	@OneToOne
	@Column(name = "user_seq", unique = true)
	private StudyUser userSeq;

	@Column(name = "phone")
	private String phoneNumber;

	@Column(length = 20)
	private String area;

	@ManyToOne
	@JoinColumn(name = "category_seq")
	private StudyCategory interestedCategory;

	@ManyToOne
	@JoinColumn(name = "room_seq")
	private StudyRoom interestedRoom;

	private Short userGrade;

	private StudyRoom roomSeq;

}
