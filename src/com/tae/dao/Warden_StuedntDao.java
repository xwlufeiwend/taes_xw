package com.tae.dao;

import java.util.List;

import com.tae.domain.Student;

/**
 * 学生管理的dao接口
 * @author Administrator
 *
 */
public interface Warden_StuedntDao {
	/**
	 * 查询学生的数量
	 * @return
	 */
	int findCount();
	/**
	 * 分页查询并按order排序所有学生信息
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Student> findByPage(int begin, int pageSize, String order);
	/**
	 * 保存添加的学生信息
	 * @param student
	 */
	void save(Student student);
	/**
	 * 通过学号查询学生信息
	 * @param i 
	 * @return
	 */
	List<Student> findByStudentNo(String i);
	/**
	 * 通过id查询所有学生信息
	 * @param id
	 * @return
	 */
	Student findById(int id);
	/**
	 * 修改学生信息
	 */
	void update(Student student);
	/**
	 * 删除学生信息
	 * @param student
	 */
	void delete(Student student);
	

}
