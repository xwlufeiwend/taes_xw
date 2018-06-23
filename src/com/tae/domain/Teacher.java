package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 教师信息
 * 
 * @author 熊伟
 *
 */
public class Teacher {
	//主键
	private Integer teacherId;
	// 教师编号
	private String teacherNo;
	// 教师姓名
	private String teacherName;
	// 所属专业
	private Profession profession;
	
	//登录密码
	private String password;
	
	//多个课程多个教师
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
