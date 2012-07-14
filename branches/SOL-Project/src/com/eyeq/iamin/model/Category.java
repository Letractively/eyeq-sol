package com.eyeq.iamin.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "CATE_SEQ")
	private Integer cateSeq;

	@Column(name = "CATE_NAME")
	private String cateName;

	private Integer hits;

	@OneToMany(targetEntity = Room.class, mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Room> rooms;

	/**
	 * @return the cateSeq
	 */
	public Integer getCateSeq() {
		return cateSeq;
	}

	/**
	 * @param cateSeq
	 *            the cateSeq to set
	 */
	public void setCateSeq(Integer cateSeq) {
		this.cateSeq = cateSeq;
	}

	/**
	 * @return the cateName
	 */
	public String getCateName() {
		return cateName;
	}

	/**
	 * @param cateName
	 *            the cateName to set
	 */
	public void setCateName(String cateName) {
		this.cateName = cateName;
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

}
