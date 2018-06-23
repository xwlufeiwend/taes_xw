package com.tae.dao;

import java.util.List;

import com.tae.domain.Student;

/**
 * ѧ�������dao�ӿ�
 * @author Administrator
 *
 */
public interface Warden_StuedntDao {
	/**
	 * ��ѯѧ��������
	 * @return
	 */
	int findCount();
	/**
	 * ��ҳ��ѯ����order��������ѧ����Ϣ
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Student> findByPage(int begin, int pageSize, String order);
	/**
	 * ������ӵ�ѧ����Ϣ
	 * @param student
	 */
	void save(Student student);
	/**
	 * ͨ��ѧ�Ų�ѯѧ����Ϣ
	 * @param i 
	 * @return
	 */
	List<Student> findByStudentNo(String i);
	/**
	 * ͨ��id��ѯ����ѧ����Ϣ
	 * @param id
	 * @return
	 */
	Student findById(int id);
	/**
	 * �޸�ѧ����Ϣ
	 */
	void update(Student student);
	/**
	 * ɾ��ѧ����Ϣ
	 * @param student
	 */
	void delete(Student student);
	

}
