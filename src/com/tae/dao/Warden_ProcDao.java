package com.tae.dao;

import java.util.List;
import java.util.Set;

import com.tae.domain.ProfessionalClass;
/**
 * �༶����dao�ӿ�
 * @author Administrator
 *
 */
public interface Warden_ProcDao {
	/**
	 * ��ȡ��¼����
	 * @return
	 */
	int findCount();
	/**
	 * ��ҳ�����ѯ��������
	 * @param currPage
	 * @param begin 
	 * @param order
	 * @return
	 */
	List<ProfessionalClass> findByPage(int currPage, int begin, String order);
	/**
	 * ͨ���༶���Ʋ�ѯ�༶��Ϣ
	 * @param pcName
	 * @return
	 */
	List<ProfessionalClass> findByName(String pcName);
	/**
	 * ����༶��Ϣ
	 * @param pClass 
	 */
	void save(ProfessionalClass pClass);
	/**
	 * ���°༶��Ϣ
	 * @param pClass 
	 */
	void update(ProfessionalClass pClass);
	/**
	 * ɾ��ѧ����Ϣ
	 * @param proc
	 */
	void delete(ProfessionalClass proc);
	/**
	 * ͨ����ѯId���޸�ѧ����Ϣ
	 * @param pcId
	 * @return
	 */
	ProfessionalClass findById(int pcId);
	/**
	 * ��ѯ���еİ༶
	 * @return
	 */
	List<ProfessionalClass> find();
	/**
	 * ��ѯ��ѧԺ�����а༶
	 * @param collegeId
	 * @return
	 */
	List<ProfessionalClass> findByCollege(int collegeId);
	/**
	 * ����ɾ���༶��Ϣ
	 * @param collegeId
	 */
	void delete(int collegeId);

}
