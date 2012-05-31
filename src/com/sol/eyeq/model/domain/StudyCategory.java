package com.sol.eyeq.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class StudyCategory {

	@Id
	private Long categorySeq;

}
