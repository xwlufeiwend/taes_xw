package com.tae.dao;

import java.util.List;

import com.tae.domain.College;

public interface Warden_CollegeDao {
	/**
	 * ��ѯѧԺ��Ϣͨ������
	 * @param collegeName
	 * @return
	 */
	List<College> findByCollegeName(String collegeName);
	
	/**
	 * ��ѯ����Ժϵ��Ŀ
	 * @return
	 */
	int findCount();
	
	/**
	 * ��ҳ��ѯԺϵ����
	 * @param begin
	 * @param pageSize
	 * @return
	 */
	List<College> findByPage(int begin, int pageSize ,String order);
	/**
	 * ����Ժϵ��Ϣ
	 * @param college
	 */
	void save(College college);
	/**
	 * ͨ��Id��ѯѧԺ��Ϣ
	 * @param collegeId
	 * @return
	 */
	College findById(Integer collegeId);
	/**
	 * ɾ��ѧԺ��Ϣ
	 * @param college
	 */
	void delete(College college);
	/**
	 * �����޸ĵ�ѧ����Ϣ
	 * @param college
	 */
	void updateCollege(College college);
	/**
	 * ��ѯ����Ժϵ��Ϣ
	 * @return
	 */
	List<College> find();

}
