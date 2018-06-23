package com.tae.dao;

import java.util.List;

import com.tae.domain.Teacher;

/**
 * �����ʦdao�Ľӿ�
 * @author Administrator
 *
 */
public interface Warden_TeacherDao {
	/**
	 * ��ȡ�������ݵ�����
	 * @return
	 */
	int findCount();
	/**
	 * ��ҳ��ѯ��������Դ
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Teacher> findAll(int begin, int pageSize, String order);
	/**
	 * ��ѯ��ѧԺ�ж�������ʦ��Ϣ
	 * @param collegeName 
	 * @return
	 */
	int findByCollegeNameCount(String collegeName);
	/**
	 * ͨ��ѧԺ��ѯ��ʦ��Ϣ
	 * @param collegeName
	 * @return
	 */
	List<Teacher> findByCollegeName(String collegeName);
	/**
	 * ������ӵĽ�ʦ����Ϣ
	 * @param teacher
	 */
	void save(Teacher teacher);
	/**
	 * ��ѯҪ�޸ĵĽ�ʦ��Ϣ
	 * @param teacherId
	 * @return
	 */
	Teacher findById(int teacherId);
	/**
	 * ���½�ʦ��Ϣ
	 * @param teacher
	 */
	void update(Teacher teacher);
	/**
	 * ɾ����ʦ��Ϣ
	 * @param teacher
	 */
	void delete(Teacher teacher);
	/**
	 * ��ѯ���н�ʦ��Ϣ
	 * @return
	 */
	List<Teacher> find();

}
