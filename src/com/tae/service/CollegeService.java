package com.tae.service;

import com.tae.domain.College;

import net.sf.json.JSONObject;

public interface CollegeService {
	/**
	 * 显示所有学院信息
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param collegeName 
	 * @return
	 */
	JSONObject show(int first, int rows, String sort, String order, String collegeName);
	/**
	 * 添加学院信息
	 * @param college
	 * @return
	 */
	int add(College college);
	/**
	 * 修改学院信息
	 * @param college
	 * @return
	 */
	int update(College college);
	/**
	 * 查询要修改的学院信息
	 * @param collegeId
	 * @return
	 */
	JSONObject findById(Integer collegeId);
	/**
	 * 删除学院信息
	 * @param ids
	 * @return 
	 */
	int delete(String ids);
	
}
