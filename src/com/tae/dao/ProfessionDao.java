package com.tae.dao;

import java.util.List;

import com.tae.domain.Profession;

/**
 * רҵdao�ӿ�
 * @author Administrator
 *
 */
public interface ProfessionDao {
	/**
	 * �����ݿ��ѯ
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param pName 
	 * @return
	 */
	List<Profession> show(int first, int rows, String sort, String order, String pName);
	/**
	 * �ܼ�¼��
	 * @param pName 
	 * @return
	 */
	int findCount(String pName);
	/**
	 * רҵ����
	 * @param profession
	 * @param collegeId 
	 * @return 
	 */
	int save(Profession profession, String collegeId);
	/**
	 * ����Ҫ�޸ĵļ�¼
	 * @param getpId
	 * @return
	 */
	Profession findById(Integer getpId);
	/**
	 * �����޸�֮�������
	 * @param profession
	 * @param collegeId 
	 * @return
	 */
	int update(Profession profession, String collegeId);
	/**
	 * ɾ����ѡ����
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 * ��ѯ����רҵ
	 * @return
	 */
	List<Profession> findAll();

}
