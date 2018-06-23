package com.tae.dao;

import java.util.List;
import com.tae.domain.Teacher;

public interface TeacherDao {
	/**
	 * �����ݿ���֤
	 * @param teacher
	 * @return
	 */
	Teacher findNoAndPwd(Teacher teacher);
	/**
	 * �����ݿ�����û���Ϣ
	 * @param teacherId
	 * @return
	 */
	Teacher findInfo(int teacherId);
	/**
	 * �������ݿ������
	 * @param teacher
	 */
	void updatePassword(Teacher teacher);
	/**
	 * ��ѯ����
	 * @param teacherId
	 * @return
	 */
	Teacher findById(int teacherId);
	/**
	 * ��ʾ
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param teacherName
	 * @return
	 */
	List<Teacher> show(int first, int rows, String sort, String order, String teacherName);
	/**
	 * ���Ҽ�¼��
	 * @param teacherName
	 * @return
	 */
	int findCount(String teacherName);
	/**
	 * ����
	 * @param teacher
	 * @param pId
	 * @return
	 */
	int save(Teacher teacher, String pId);
	/**
	 * ����
	 * @param teacher
	 * @param pId
	 * @return
	 */
	int update(Teacher teacher, String pId);
	/**
	 * ɾ��
	 * @param ids
	 * @return
	 */
	int delete(String ids);

}
