package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ��ʦ��Ϣ
 * 
 * @author ��ΰ
 *
 */
public class Teacher {
	//����
	private Integer teacherId;
	// ��ʦ���
	private String teacherNo;
	// ��ʦ����
	private String teacherName;
	// ����רҵ
	private Profession profession;
	
	//��¼����
	private String password;
	
	//����γ̶����ʦ
	private Set<CouresesTeacher> couresesTeachers = new HashSet<>();

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<CouresesTeacher> getCouresesTeachers() {
		return couresesTeachers;
	}

	public void setCouresesTeachers(Set<CouresesTeacher> couresesTeachers) {
		this.couresesTeachers = couresesTeachers;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
