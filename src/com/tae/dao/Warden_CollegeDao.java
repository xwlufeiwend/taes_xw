package com.tae.dao;

import java.util.List;

import com.tae.domain.College;

public interface Warden_CollegeDao {
	/**
	 * 查询学院信息通过名称
	 * @param collegeName
	 * @return
	 */
	List<College> findByCollegeName(String collegeName);
	
	/**
	 * 查询所有院系数目
	 * @return
	 */
	int findCount();
	
	/**
	 * 分页查询院系数据
	 * @param begin
	 * @param pageSize
	 * @return
	 */
	List<College> findByPage(int begin, int pageSize ,String order);
	/**
	 * 保存院系信息
	 * @param college
	 */
	void save(College college);
	/**
	 * 通过Id查询学院信息
	 * @param collegeId
	 * @return
	 */
	College findById(Integer collegeId);
	/**
	 * 删除学院信息
	 * @param college
	 */
	void delete(College college);
	/**
	 * 保存修改的学生信息
	 * @param college
	 */
	void updateCollege(College college);
	/**
	 * 查询所有院系信息
	 * @return
	 */
	List<College> find();

}
