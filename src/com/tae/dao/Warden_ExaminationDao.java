package com.tae.dao;

import java.util.List;

import com.tae.domain.Examination;

/**
 * 考试信息dao接口
 * @author Administrator
 *
 */
public interface Warden_ExaminationDao {
	/**
	 * 保存添加的考试信息到数据库中
	 * @param examination
	 */
	void save(Examination examination);
	/**
	 * 获取数据库中总记录数
	 * @return
	 */
	int findCount();
	/**
	 * 分页获取数据源
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Examination> findByPage(int begin, int pageSize, String order);
	/**
	 * 保存修改的考试信息到数据库
	 * @param examination
	 */
	void update(Examination examination);
	/**
	 * 删除数据库中的考试信息
	 * @param examination
	 */
	void delete(Examination examination);
	/**
	 * 从数据库中查找要修改的信息
	 * @param exId
	 * @return
	 */
	Examination findById(int exId);
	/**
	 * 通过名称模糊查询数据库
	 * @param collegeName
	 * @return
	 */
	List<Examination> findByName(String collegeName);
	/**
	 * 查询所有考试信息从数据库
	 * @return
	 */
	List<Examination> find();

}
