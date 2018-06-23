package com.tae.dao;

import java.util.List;

import com.tae.domain.Courses;
import com.tae.domain.Examination;
import com.tae.domain.Score;
import com.tae.domain.Student;

/**
 * ѧ���û���dao��
 * @author Administrator
 *
 */
public interface StudentDao {
	/**
	 * �����ݿ��в�ѯ��ѧ���û��Ƿ����
	 * @param student
	 * @return
	 */
	Student findByNoAndPwd(Student student);
	/**
	 * �����ݿ��е�ȡѧ���û���Ϣ
	 * @param student
	 * @return
	 */
	Student findInfo(int student);
	/**
	 * ����
	 * @param student
	 */
	void update(Student student);
	/**
	 * ��ѯ���ݿ��ѧ���ж��ٿγ�
	 * @param studentId
	 * @return
	 */
	int findCoursesCount(int studentId);
	/**
	 * �����ݿ��ȡ��ѧ���Ŀγ�����Դ
	 * @param studentId
	 * @return
	 */
	List<Courses> findCourses(int studentId);
	/**
	 * �����ݿ��ѯѧԺid
	 * @param studentId
	 * @return
	 */
	int findCollegeId(int studentId);
	/**
	 * ͨ��ѧԺid��ѯ���ݿ�õ���ѧԺ�Ŀ�����Ϣ
	 * @param collegeId
	 * @return
	 */
	List<Examination> findExam(int collegeId);
	/**
	 * �����ݿ��ѯ��ѧ���ķ�����
	 * @param studentId
	 * @return
	 */
	int findScoreCount(int studentId);
	/**
	 * ��ҳ��ȡ���ݿ��и�ѧ���ķ������
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @param studentId
	 * @return
	 */
	List<Score> findScoreByPage(int begin, int pageSize, String order, int studentId);
	/**
	 * ͨ���γ̷�ҳ��ȡ���ݿ��и�ѧ���ķ������
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @param studentId
	 * @param coursesId
	 * @return
	 */
	List<Score> findScoreByPage(int begin, int pageSize, String order, int studentId, int coursesId);
	/**
	 * ����ѧ���Ϳγ̺Ų�ѯ���ݿ��з������ж���
	 * @param studentId
	 * @param coursesId
	 * @return
	 */
	int findCoursesCount(int studentId, int coursesId);

}
