package com.tae.dao;

import java.util.List;

import com.tae.domain.College;

/**
 * ѧԺdao
 * @author Administrator
 *
 */
public interface CollegeDao {
	/**
	 * �����ݿ��ȡ����Դ
	 * @param first
	 * @param rows
	 * @param sort
	 * @param order
	 * @param collegeName 
	 * @return
	 */
	List<College> show(int first, int rows, String sort, String order, String collegeName);
	/**
	 * Ѱ�Ҽ�¼��
	 * @param collegeName 
	 * @return
	 */
	int findCount(String collegeName);
	/**
	 * ������ӵ�ѧԺ��Ϣ
	 * @param college
	 * @return
	 */
	int save(College college);
	/**
	 * �޸�ѧԺ��Ϣ
	 * @param college
	 * @return
	 */
	int update(College college);
	/**
	 * �����ݿ��ѯҪ�޸ĵ���Ϣ
	 * @param collegeId
	 * @return
	 */
	College findById(Integer collegeId);
	/**
	 * �����ݿ���ɾ��ѧԺ��Ϣ
	 * @param ids
	 * @return
	 */
	int delete(String ids);
	/**
	 *��ȡcollegeName
	 * @param getpId
	 * @return
	 */
	Object findCollegeName(Integer getpId);
	/**
	 * ��ѯ����ѧԺ�б�
	 * @return
	 */
	List<College> findAll();

}
