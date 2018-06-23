package com.tae.dao;

import java.util.List;

import com.tae.domain.Teacher;

/**
 * 管理教师dao的接口
 * @author Administrator
 *
 */
public interface Warden_TeacherDao {
	/**
	 * 获取所有数据的条数
	 * @return
	 */
	int findCount();
	/**
	 * 分页查询所有数据源
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Teacher> findAll(int begin, int pageSize, String order);
	/**
	 * 查询该学院有多少条教师信息
	 * @param collegeName 
	 * @return
	 */
	int findByCollegeNameCount(String collegeName);
	/**
	 * 通过学院查询教师信息
	 * @param collegeName
	 * @return
	 */
	List<Teacher> findByCollegeName(String collegeName);
	/**
	 * 保存添加的教师的信息
	 * @param teacher
	 */
	void save(Teacher teacher);
	/**
	 * 查询要修改的教师信息
	 * @param teacherId
	 * @return
	 */
	Teacher findById(int teacherId);
	/**
	 * 更新教师信息
	 * @param teacher
	 */
	void update(Teacher teacher);
	/**
	 * 删除教师信息
	 * @param teacher
	 */
	void delete(Teacher teacher);
	/**
	 * 查询所有教师信息
	 * @return
	 */
	List<Teacher> find();

}
