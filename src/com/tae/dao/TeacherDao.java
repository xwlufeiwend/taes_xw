package com.tae.dao;

import java.util.List;
import com.tae.domain.Teacher;

public interface TeacherDao {
	/**
	 * 从数据库验证
	 * @param teacher
	 * @return
	 */
	Teacher findNoAndPwd(Teacher teacher);
	/**
	 * 从数据库调用用户信息
	 * @param teacherId
	 * @return
	 */
	Teacher findInfo(int teacherId);
	/**
	 * 更新数据库的密码
	 * @param teacher
	 */
	void updatePassword(Teacher teacher);
	/**
	 * 查询数据
	 * @param teacherId
	 * @return
	 */
	Teacher findById(int teacherId);
	/**
	 * 显示
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param teacherName
	 * @return
	 */
	List<Teacher> show(int first, int rows, String sort, String order, String teacherName);
	/**
	 * 查找记录数
	 * @param teacherName
	 * @return
	 */
	int findCount(String teacherName);
	/**
	 * 保存
	 * @param teacher
	 * @param pId
	 * @return
	 */
	int save(Teacher teacher, String pId);
	/**
	 * 更新
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

}
