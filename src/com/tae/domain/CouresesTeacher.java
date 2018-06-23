package com.tae.domain;
/**
 * 课程和教师表结合
 * @author Administrator
 *
 */
public class CouresesTeacher {
	//id
	private Integer id;
	//学年9月份到7月份
	private String ctTime;
	//学期 上，下，第一，第二
	private String term;
	//课程名称
	private Courses courses;
	//教师名称
	private Teacher teacher;
	
	
	
	//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCtTime() {
		return ctTime;
	}
	public void setCtTime(String ctTime) {
		this.ctTime = ctTime;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public CouresesTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
