package com.tae.dao;

import java.util.List;

import com.tae.domain.Courses;
import com.tae.domain.Examination;
import com.tae.domain.Score;
import com.tae.domain.Student;

/**
 * 学生用户的dao类
 * @author Administrator
 *
 */
public interface StudentDao {
	/**
	 * 从数据库中查询该学生用户是否存在
	 * @param student
	 * @return
	 */
	Student findByNoAndPwd(Student student);
	/**
	 * 从数据库中调取学生用户信息
	 * @param student
	 * @return
	 */
	Student findInfo(int student);
	/**
	 * 更新
	 * @param student
	 */
	void update(Student student);
	/**
	 * 查询数据库该学生有多少课程
	 * @param studentId
	 * @return
	 */
	int findCoursesCount(int studentId);
	/**
	 * 从数据库获取该学生的课程数据源
	 * @param studentId
	 * @return
	 */
	List<Courses> findCourses(int studentId);
	/**
	 * 从数据库查询学院id
	 * @param studentId
	 * @return
	 */
	int findCollegeId(int studentId);
	/**
	 * 通过学院id查询数据库得到该学院的考试信息
	 * @param collegeId
	 * @return
	 */
	List<Examination> findExam(int collegeId);
	/**
	 * 从数据库查询该学生的分数条
	 * @param studentId
	 * @return
	 */
	int findScoreCount(int studentId);
	/**
	 * 分页获取数据库中该学生的分数情况
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @param studentId
	 * @return
	 */
	List<Score> findScoreByPage(int begin, int pageSize, String order, int studentId);
	/**
	 * 通过课程分页获取数据库中该学生的分数情况
	 * @param begin
	 * @param pageSize
	 * @param order
	 * @param studentId
	 * @param coursesId
	 * @return
	 */
	List<Score> findScoreByPage(int begin, int pageSize, String order, int studentId, int coursesId);
	/**
	 * 根据学生和课程号查询数据库中分数条有多少
	 * @param studentId
	 * @param coursesId
	 * @return
	 */
	int findCoursesCount(int studentId, int coursesId);

}
