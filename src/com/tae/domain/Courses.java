package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 课程信息
 * 
 * @author 熊伟
 *
 */
public class Courses{
	//主键
	private Integer coursesId;
	// 课程代号
	private String coursesNo;
	// 课程名称
	private String coursesName;
	// 课程学分
	private double credits;
	// 课程专业
	private Profession profession;
	
	//多个课程多个教师
	private Set<CouresesTeacher> couresesTeachers = new HashSet<>();
	//一个课程多张试卷
	private Set<Paper> papers = new HashSet<>();
	//一门课程多个分数
	private Set<Score> scores = new HashSet<>();
	
	public Integer getCoursesId() {
		return coursesId;
	}

	public void setCoursesId(Integer coursesId) {
		this.coursesId = coursesId;
	}

	public String getCoursesNo() {
		return coursesNo;
	}

	public void setCoursesNo(String coursesNo) {
		this.coursesNo = coursesNo;
	}

	public String getCoursesName() {
		return coursesName;
	}

	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Set<CouresesTeacher> getCouresesTeachers() {
		return couresesTeachers;
	}

	public void setCouresesTeachers(Set<CouresesTeacher> couresesTeachers) {
		this.couresesTeachers = couresesTeachers;
	}

	public Set<Paper> getPapers() {
		return papers;
	}

	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
