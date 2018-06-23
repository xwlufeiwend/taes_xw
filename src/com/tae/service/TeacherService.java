package com.tae.service;

import com.tae.domain.Teacher;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 教师service接口
 * @author Administrator
 *
 */
public interface TeacherService {
	/**
	 * 显示
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param teacherName
	 * @return
	 */
	JSONObject show(int first, int rows, String sort, String order, String teacherName);
	/**
	 * 添加
	 * @param teacher
	 * @param pId
	 * @return
	 */
	int save(Teacher teacher, String pId);
	/**
	 * 获取修改
	 * @param teacherId
	 * @return
	 */
	JSONObject getteacher(Integer teacherId);
	/**
	 * 修改
	 * @param teacher
	 * @param pId
	 * @return
	 */
	int update(Teacher teacher, String pId);
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 * 获取专业名称
	 * @return
	 */
	JSONArray getProfessionName();

}
