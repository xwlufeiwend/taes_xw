package com.tae.dao;

import java.util.List;

import com.tae.domain.Courses;

/**
 * �γ̵�dao�ӿ�
 * @author Administrator
 *
 */
public interface Warden_CoursesDao {
	/**
	 * ��ѯ�γ̼�¼�ж�����
	 * @return
	 */
	int findCount();
	/**
	 * ��ҳ��ѯ����
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Courses> findByPage(int begin, int pageSize, String order);
	/**
	 * @param courses 
	 * ������ӵĿγ���Ϣ�����ݿ���
	 */
	void save(Courses courses);
	/**
	 * �����޸�֮�����Ϣ�����ݿ���
	 * @param courses
	 */
	void update(Courses courses);
	/**
	 * �����ݿ���ɾ���γ���Ϣ
	 * @param courses
	 */
	void delete(Courses courses);
	/**
	 * �����ݿ��в���Ҫ�޸ĵĿγ���Ϣ
	 * @param coursesId
	 * @return
	 */
	Courses findById(int coursesId);
	/**
	 * ͨ������ģ����ѯ�γ���Ϣ
	 * @param coursesName
	 * @return
	 */
	List<Courses> findByName(String coursesName);
	/**
	 * �����ݿ��в�ѯ���пγ���Ϣ
	 * @return
	 */
	List<Courses> find();
	/**
	 * ����id��ѯ��ʦ�Ŀγ�
	 * @param teacherId
	 * @return
	 */
	int findCount(int teacherId);
	/**
	 * ��ҳ����Դ
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @param teacherId
	 * @return
	 */
	List<Courses> findCoursesByPage(int begin, int pageSize, String order, int teacherId);
	/**
	 * �����ݿ��ѯ�γ���Ϣ���ݽ�ʦid
	 * @param teacherId
	 * @return
	 */
	List<Courses> findCourses(int teacherId);

}
