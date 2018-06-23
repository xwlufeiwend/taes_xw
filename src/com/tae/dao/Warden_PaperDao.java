package com.tae.dao;

import java.util.List;

import com.tae.domain.Paper;

public interface Warden_PaperDao {
	/**
	 * 从数据库中查找出所有的记录数
	 * @return
	 */
	int findCount();
	/**
	 * 从数据库中得出分页数据源
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Paper> findByPage(int begin, int pageSize, String order);
	/**
	 * 从数据库中查询所有数据
	 * @return
	 */
	List<Paper> find();
	/**
	 * 保存添加的试卷数据到数据库
	 * @param paper 
	 */
	void save(Paper paper);
	/**
	 * 通过试卷名称模糊查询数据库
	 * @param paperName
	 * @return
	 */
	List<Paper> findByName(String paperName);
	/**
	 * 通过主键查询试卷数据库
	 * @param paperId
	 * @return
	 */
	Paper findById(int paperId);
	/**
	 * 保存修改的试卷信息到数据库
	 * @param paper
	 */
	void update(Paper paper);
	/**
	 * 从数据库删除试卷信息
	 * @param paper
	 */
	void delete(Paper paper);
	/**
	 * 保存细分到数据库中
	 * @param paperId
	 * @param title
	 * @param pScore
	 */
	void saveD(int paperId, String title, int pScore);

}
