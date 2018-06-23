package com.tae.service;

import com.tae.domain.College;

import net.sf.json.JSONObject;

public interface CollegeService {
	/**
	 * ��ʾ����ѧԺ��Ϣ
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param collegeName 
	 * @return
	 */
	JSONObject show(int first, int rows, String sort, String order, String collegeName);
	/**
	 * ���ѧԺ��Ϣ
	 * @param college
	 * @return
	 */
	int add(College college);
	/**
	 * �޸�ѧԺ��Ϣ
	 * @param college
	 * @return
	 */
	int update(College college);
	/**
	 * ��ѯҪ�޸ĵ�ѧԺ��Ϣ
	 * @param collegeId
	 * @return
	 */
	JSONObject findById(Integer collegeId);
	/**
	 * ɾ��ѧԺ��Ϣ
	 * @param ids
	 * @return 
	 */
	int delete(String ids);
	
}
