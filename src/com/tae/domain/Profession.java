package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * רҵ��
 * @author ��ΰ
 *
 */
public class Profession {
	//����
	private Integer pId;
	//רҵ��
	private String pNo;
	//רҵ����
	private String pName;
	//����Ժϵ
	private College college;
	
	//һ��רҵ����γ�
	private Set<Courses> courses = new HashSet<>();
	//һ��רҵ�����ʦ
	private Set<Teacher> teachers = new HashSet<>();
	//һ��רҵ����༶
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
