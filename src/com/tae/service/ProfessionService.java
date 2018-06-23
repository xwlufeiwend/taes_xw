package com.tae.service;

import com.tae.domain.Profession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * רҵ�ӿ�
 * @author Administrator
 *
 */
public interface ProfessionService {
	/**
	 * ��ʾ����רҵ��Ϣ
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param pName 
	 * @return
	 */
	JSONObject show(int first, int rows, String sort, String order, String pName);
	/**
	 * ������ӵ�רҵ
	 * @param profession
	 * @param collegeId 
	 * @return 
	 */
	int save(Profession profession, String collegeId);
	/**
	 * ��ȡҪ�޸ĵ�רҵ����
	 * @param getpId
	 * @return
	 */
	JSONObject getProfession(Integer getpId);
	/**
	 * �����޸ĺ������
	 * @param profession
	 * @param collegeId 
	 * @return
	 */
	int update(Profession profession, String collegeId);
	/**
	 * ɾ��ѡ����רҵ
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 * ��ȡѧԺ
	 * @return
	 */
	JSONArray getCollegeName();

}
