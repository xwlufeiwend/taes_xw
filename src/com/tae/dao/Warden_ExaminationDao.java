package com.tae.dao;

import java.util.List;

import com.tae.domain.Examination;

/**
 * ������Ϣdao�ӿ�
 * @author Administrator
 *
 */
public interface Warden_ExaminationDao {
	/**
	 * ������ӵĿ�����Ϣ�����ݿ���
	 * @param examination
	 */
	void save(Examination examination);
	/**
	 * ��ȡ���ݿ����ܼ�¼��
	 * @return
	 */
	int findCount();
	/**
	 * ��ҳ��ȡ����Դ
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Examination> findByPage(int begin, int pageSize, String order);
	/**
	 * �����޸ĵĿ�����Ϣ�����ݿ�
	 * @param examination
	 */
	void update(Examination examination);
	/**
	 * ɾ�����ݿ��еĿ�����Ϣ
	 * @param examination
	 */
	void delete(Examination examination);
	/**
	 * �����ݿ��в���Ҫ�޸ĵ���Ϣ
	 * @param exId
	 * @return
	 */
	Examination findById(int exId);
	/**
	 * ͨ������ģ����ѯ���ݿ�
	 * @param collegeName
	 * @return
	 */
	List<Examination> findByName(String collegeName);
	/**
	 * ��ѯ���п�����Ϣ�����ݿ�
	 * @return
	 */
	List<Examination> find();

}
