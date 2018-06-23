package com.tae.service;

import com.tae.domain.Warden;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface WardenService {
	/**
	 * ��ѯ�Ƿ���ڴ˹���Ա
	 * @param warden 
	 * @return
	 */
	Warden findByNoAndPwd(Warden warden);
	/**
	 * ��ʾ��ǰ����Ա����Ϣ
	 * @param wName 
	 * @param level 
	 * @param string2 
	 * @param string 
	 * @param i 
	 * @param getwId
	 * @return
	 */
	JSONObject show(int first,int rows, String sort, String order, String wName);
	/**
	 * ������ӵĹ���Ա��Ϣ
	 * @param warden
	 * @return 
	 */
	int save(Warden warden);
	/**
	 * �����޸ĺ�Ĺ���Ա��Ϣ
	 * @param warden
	 */
	int update(Warden warden);
	/**
	 * ��ȡ������
	 * @param id
	 * @return
	 */
	JSONArray getNav(String id);
	/**
	 * ��ȡҪ�༭����������
	 * @param getwId
	 * @return
	 */
	JSONObject findById(int getwId);
	/**
	 * ����ɾ������
	 * @param ids
	 */
	int delete(String ids);


}
