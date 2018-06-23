package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Profession;
import com.tae.service.ProfessionService;
/**
 * רҵ��action
 * @author Administrator
 *
 */

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class ProfessionAction extends ActionSupport implements ModelDriven<Profession>{
	private static final long serialVersionUID = 1L;
	HttpServletResponse response = ServletActionContext.getResponse();
	PrintWriter out;
	private Profession profession;
	@Override
	public Profession getModel() {
		// TODO Auto-generated method stub
		if (profession == null) {
			profession = new Profession();
		}
		return profession;
	}
	
	//ע��
	private ProfessionService professionService;
	public void setProfessionService(ProfessionService professionService) {
		this.professionService = professionService;
	}
	
	//����ǰ̨��json
	private JSONObject show = null;
	public JSONObject getShow() {
		return show;
	}
	public void setShow(JSONObject show) {
		this.show = show;
	}
	//����page rows sort order
	private int page;
	private int rows;
	private String sort;
	private String order;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	/**
	 * ��ʾ����רҵ��Ϣ
	 * @return
	 */
	public String show(){
		int first = rows*(page - 1);
		System.err.println("pname="+profession.getpName());
		//show = professionService.show(first,rows,sort,order,profession.getpName(),profession.getCollege().getCollegeName());
		show = professionService.show(first,rows,sort,order,profession.getpName());
		
		return SUCCESS;
	}
	private String collegeId = null;
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	/**
	 * ���רҵ��Ϣ
	 * @return
	 */
	public String profession_add(){
		System.err.println();
		System.err.println("collegeId="+collegeId);
		//System.err.println("collegeId="+profession.getCollege().getCollegeId());
		int a = professionService.save(profession,collegeId);
		response.setCharacterEncoding("utf-8");
		try {
			out = response.getWriter();
			out.print(a);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//profession.getCollege();
		//System.err.println("ѧԺ="+profession.getCollege());
		return SUCCESS;
	}
	//editData����ǰ�˵�ָ���޸ĵ�����
	private JSONObject editData = null;
	public JSONObject getEditData() {
		return editData;
	}
	public void setEditData(JSONObject editData) {
		this.editData = editData;
	}
	/**
	 * ����ָ��Ҫ�޸ĵ�����
	 * @return
	 */
	public String edit(){
		editData = professionService.getProfession(profession.getpId());
		return SUCCESS;
	}
	/**
	 * �ϴ�Ҫ�޸ĵ�����
	 * @return
	 */
	public String update(){
		int u = professionService.update(profession,collegeId);
		response.setCharacterEncoding("utf-8");
		try {
			out = response.getWriter();
			out.print(u);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return SUCCESS;
	}
	//����ids
	private String ids;
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	/**
	 * ɾ��רҵ��Ϣ
	 * @return
	 */
	public String delete(){
		int d = professionService.delete(ids);
		response.setCharacterEncoding("utf-8");
		try {
			out = response.getWriter();
			out.print(d);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	//��ȡѧԺ���Ƶ�json
	private JSONArray cName = null;
	public JSONArray getcName() {
		return cName;
	}
	public void setcName(JSONArray cName) {
		this.cName = cName;
	}
	/**
	 * ��ȡѧԺ���Ƹ�ֵ��������
	 * @return
	 */
	public String getCollegeName(){
		cName = professionService.getCollegeName();
		return SUCCESS;
	}
	
	

}
