package com.tae.service;

import com.tae.domain.Profession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 专业接口
 * @author Administrator
 *
 */
public interface ProfessionService {
	/**
	 * 显示所有专业信息
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param pName 
	 * @return
	 */
	JSONObject show(int first, int rows, String sort, String order, String pName);
	/**
	 * 保存添加的专业
	 * @param profession
	 * @param collegeId 
	 * @return 
	 */
	int save(Profession profession, String collegeId);
	/**
	 * 获取要修改的专业数据
	 * @param getpId
	 * @return
	 */
	JSONObject getProfession(Integer getpId);
	/**
	 * 保存修改后的数据
	 * @param profession
	 * @param collegeId 
	 * @return
	 */
	int update(Profession profession, String collegeId);
	/**
	 * 删除选定的专业
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 * 获取学院
	 * @return
	 */
	JSONArray getCollegeName();

}
