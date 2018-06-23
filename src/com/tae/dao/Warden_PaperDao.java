package com.tae.dao;

import java.util.List;

import com.tae.domain.Paper;

public interface Warden_PaperDao {
	/**
	 * �����ݿ��в��ҳ����еļ�¼��
	 * @return
	 */
	int findCount();
	/**
	 * �����ݿ��еó���ҳ����Դ
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @return
	 */
	List<Paper> findByPage(int begin, int pageSize, String order);
	/**
	 * �����ݿ��в�ѯ��������
	 * @return
	 */
	List<Paper> find();
	/**
	 * ������ӵ��Ծ����ݵ����ݿ�
	 * @param paper 
	 */
	void save(Paper paper);
	/**
	 * ͨ���Ծ�����ģ����ѯ���ݿ�
	 * @param paperName
	 * @return
	 */
	List<Paper> findByName(String paperName);
	/**
	 * ͨ��������ѯ�Ծ����ݿ�
	 * @param paperId
	 * @return
	 */
	Paper findById(int paperId);
	/**
	 * �����޸ĵ��Ծ���Ϣ�����ݿ�
	 * @param paper
	 */
	void update(Paper paper);
	/**
	 * �����ݿ�ɾ���Ծ���Ϣ
	 * @param paper
	 */
	void delete(Paper paper);
	/**
	 * ����ϸ�ֵ����ݿ���
	 * @param paperId
	 * @param title
	 * @param pScore
	 */
	void saveD(int paperId, String title, int pScore);

}
