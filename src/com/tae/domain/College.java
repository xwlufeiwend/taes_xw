package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 学院表
 * 
 * @author 熊伟
 *
 */
public class College {
	private Integer collegeId;
	//院系代码号
	private String collegeNo;
	// 院系名称
	private String collegeName;
	
	private Set<Profession> professions = new HashSet<>();
	//
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeNo() {
		return collegeNo;
	}
	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Set<Profession> getProfessions() {
		return professions;
	}
	public void setProfessions(Set<Profession> professions) {
		this.professions = professions;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
