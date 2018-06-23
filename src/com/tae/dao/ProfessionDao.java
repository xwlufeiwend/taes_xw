package com.tae.dao;

import java.util.List;

import com.tae.domain.Profession;

/**
 * 专业dao接口
 * @author Administrator
 *
 */
public interface ProfessionDao {
	/**
	 * 从数据库查询
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param pName 
	 * @return
	 */
	List<Profession> show(int first, int rows, String sort, String order, String pName);
	/**
	 * 总记录数
	 * @param pName 
	 * @return
	 */
	int findCount(String pName);
	/**
	 * 专业保存
	 * @param profession
	 * @param collegeId 
	 * @return 
	 */
	int save(Profession profession, String collegeId);
	/**
	 * 查找要修改的记录
	 * @param getpId
	 * @return
	 */
	Profession findById(Integer getpId);
	/**
	 * 保存修改之后的数据
	 * @param profession
	 * @param collegeId 
	 * @return
	 */
	int update(Profession profession, String collegeId);
	/**
	 * 删除所选数据
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 * 查询所有专业
	 * @return
	 */
	List<Profession> findAll();

}
