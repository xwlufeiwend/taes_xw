package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ѧԺ��
 * 
 * @author ��ΰ
 *
 */
public class College {
	private Integer collegeId;
	//Ժϵ�����
	private String collegeNo;
	// Ժϵ����
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
