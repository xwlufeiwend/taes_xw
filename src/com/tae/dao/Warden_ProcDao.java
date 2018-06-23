package com.tae.dao;

import java.util.List;
import java.util.Set;

import com.tae.domain.ProfessionalClass;
/**
 * 班级管理dao接口
 * @author Administrator
 *
 */
public interface Warden_ProcDao {
	/**
	 * 获取记录条数
	 * @return
	 */
	int findCount();
	/**
	 * 分页排序查询所有数据
	 * @param currPage
	 * @param begin 
	 * @param order
	 * @return
	 */
	List<ProfessionalClass> findByPage(int currPage, int begin, String order);
	/**
	 * 通过班级名称查询班级信息
	 * @param pcName
	 * @return
	 */
	List<ProfessionalClass> findByName(String pcName);
	/**
	 * 保存班级信息
	 * @param pClass 
	 */
	void save(ProfessionalClass pClass);
	/**
	 * 更新班级信息
	 * @param pClass 
	 */
	void update(ProfessionalClass pClass);
	/**
	 * 删除学生信息
	 * @param proc
	 */
	void delete(ProfessionalClass proc);
	/**
	 * 通过查询Id来修改学生信息
	 * @param pcId
	 * @return
	 */
	ProfessionalClass findById(int pcId);
	/**
	 * 查询所有的班级
	 * @return
	 */
	List<ProfessionalClass> find();
	/**
	 * 查询该学院的所有班级
	 * @param collegeId
	 * @return
	 */
	List<ProfessionalClass> findByCollege(int collegeId);
	/**
	 * 级联删除班级信息
	 * @param collegeId
	 */
	void delete(int collegeId);

}
