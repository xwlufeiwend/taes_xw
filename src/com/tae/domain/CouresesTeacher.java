package com.tae.domain;
/**
 * �γ̺ͽ�ʦ����
 * @author Administrator
 *
 */
public class CouresesTeacher {
	//id
	private Integer id;
	//ѧ��9�·ݵ�7�·�
	private String ctTime;
	//ѧ�� �ϣ��£���һ���ڶ�
	private String term;
	//�γ�����
	private Courses courses;
	//��ʦ����
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
