package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 专业表
 * @author 熊伟
 *
 */
public class Profession {
	//主键
	private Integer pId;
	//专业号
	private String pNo;
	//专业名称
	private String pName;
	//所属院系
	private College college;
	
	//一个专业多个课程
	private Set<Courses> courses = new HashSet<>();
	//一个专业多个教师
	private Set<Teacher> teachers = new HashSet<>();
	//一个专业多个班级
	private Set<ProfessionalClass> professionalClasses = new HashSet<>();
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Set<Courses> getCourses() {
		return courses;
	}
	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Set<ProfessionalClass> getProfessionalClasses() {
		return professionalClasses;
	}
	public void setProfessionalClasses(Set<ProfessionalClass> professionalClasses) {
		this.professionalClasses = professionalClasses;
	}
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
