package com.tae.service;

import com.tae.domain.Teacher;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * ��ʦservice�ӿ�
 * @author Administrator
 *
 */
public interface TeacherService {
	/**
	 * ��ʾ
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param teacherName
	 * @return
	 */
	JSONObject show(int first, int rows, String sort, String order, String teacherName);
	/**
	 * ���
	 * @param teacher
	 * @param pId
	 * @return
	 */
	int save(Teacher teacher, String pId);
	/**
	 * ��ȡ�޸�
	 * @param teacherId
	 * @return
	 */
	JSONObject getteacher(Integer teacherId);
	/**
	 * �޸�
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
	/**
	 * ��ȡרҵ����
	 * @return
	 */
	JSONArray getProfessionName();

}
