package com.tae.dao;

import java.util.List;

import com.tae.domain.College;

/**
 * 学院dao
 * @author Administrator
 *
 */
public interface CollegeDao {
	/**
	 * 从数据库获取数据源
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param collegeName 
	 * @return
	 */
	List<College> show(int first, int rows, String sort, String order, String collegeName);
	/**
	 * 寻找记录数
	 * @param collegeName 
	 * @return
	 */
	int findCount(String collegeName);
	/**
	 * 保存添加的学院信息
	 * @param college
	 * @return
	 */
	int save(College college);
	/**
	 * 修改学院信息
	 * @param college
	 * @return
	 */
	int update(College college);
	/**
	 * 从数据库查询要修改的信息
	 * @param collegeId
	 * @return
	 */
	College findById(Integer collegeId);
	/**
	 * 从数据库中删除学院信息
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 *获取collegeName
	 * @param getpId
	 * @return
	 */
	Object findCollegeName(Integer getpId);
	/**
	 * 查询所有学院列表
	 * @return
	 */
	List<College> findAll();

}
