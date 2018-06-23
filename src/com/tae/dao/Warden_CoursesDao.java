package com.tae.dao;

import java.util.List;

import com.tae.domain.Courses;

/**
 * 课程的dao接口
 * @author Administrator
 *
 */
public interface Warden_CoursesDao {
	/**
	 * 查询课程记录有多少条
	 * @return
	 */
	int findCount();
	/**
	 * 分页查询数据
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Courses> findByPage(int begin, int pageSize, String order);
	/**
	 * @param courses 
	 * 保存添加的课程信息到数据库中
	 */
	void save(Courses courses);
	/**
	 * 保存修改之后的信息到数据库中
	 * @param courses
	 */
	void update(Courses courses);
	/**
	 * 从数据库中删除课程信息
	 * @param courses
	 */
	void delete(Courses courses);
	/**
	 * 从数据库中查找要修改的课程信息
	 * @param coursesId
	 * @return
	 */
	Courses findById(int coursesId);
	/**
	 * 通过名称模糊查询课程信息
	 * @param coursesName
	 * @return
	 */
	List<Courses> findByName(String coursesName);
	/**
	 * 从数据库中查询所有课程信息
	 * @return
	 */
	List<Courses> find();
	/**
	 * 根据id查询教师的课程
	 * @param teacherId
	 * @return
	 */
	int findCount(int teacherId);
	/**
	 * 分页数据源
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @param teacherId
	 * @return
	 */
	List<Courses> findCoursesByPage(int begin, int pageSize, String order, int teacherId);
	/**
	 * 从数据库查询课程信息根据教师id
	 * @param teacherId
	 * @return
	 */
	List<Courses> findCourses(int teacherId);

}
