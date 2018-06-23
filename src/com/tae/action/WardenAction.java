package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Warden;
import com.tae.service.WardenService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class WardenAction extends ActionSupport implements ModelDriven<Warden> {

	private static final long serialVersionUID = 1L;
	// ����ģ������
	private Warden warden;

	@Override
	public Warden getModel() {
		if (warden == null) {
			warden = new Warden();
		}
		return warden;
	}

	// ע��ҵ����wardenService
	private WardenService wardenService;

	public void setWardenService(WardenService wardenService) {
		this.wardenService = wardenService;
	}

	/**
	 * ��ת����¼ҳ��
	 * 
	 * @return
	 */
	public String login() {
		
		return "login";
	}
	/**
	 * ����Ա��¼
	 * @return
	 */
	//������֤��
	private String vcode;
	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	public String wlogin(){
		Warden existLogin = wardenService.findByNoAndPwd(warden);
		String checkcode = (String) ActionContext.getContext().getSession().get("checkcode");
		if (existLogin == null) {
			this.addActionError("�˺Ż�������������µ�¼��");
			return "login";
		}
		else if ( !checkcode.equalsIgnoreCase(vcode)) {
			this.addActionError("��֤�����");
			return "login";
		}
		else {
			//this.addActionMessage("��¼�ɹ�����ת����ҳ��");
			ActionContext.getContext().getSession().put("warden", existLogin);
			ActionContext.getContext().getSession().put("level", existLogin.getLevel());
			return "index";
		}
		
	}
	/**
	 * �˳���¼
	 * @return
	 */
	public String exit(){
		//ActionContext.getContext().getSession().clear();
		return "login";
	}
	/**
	 * ��ʾ����Ա��Ϣ
	 * @return
	 */
	public String info(){
		/*warden = (Warden) ActionContext.getContext().getSession().get("warden");
		warden = wardenService.show(warden.getwId());*/
		return "info";
	}
	/**
	 * ����ajax�����Ĳ�������ӵ����ݿ�
	 * @return
	 */
	public String add(){
		/*System.err.println("����Σ�"+warden.getwNo());
		System.err.println("����Σ�"+warden.getwName());
		System.err.println("����Σ�"+warden.getTel());
		System.err.println("����Σ�"+warden.getwPassword());*/
		int f = wardenService.save(warden);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(f);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("����Σ�"+f);
		return NONE;
	}
	/**
	 * ������ӵĹ���Ա��Ϣ
	 * @return
	 */
	public String addto(){
		wardenService.save(warden);
		this.addActionMessage("��ӳɹ���");
		return "addto";
	}
	/**
	 * �༭����Ա��Ϣ
	 * @return
	 */
	//��Ҫ�༭��json���ݴ���ǰ��
	private JSONObject editData = null;
	public JSONObject getEditData() {
		return editData;
	}
	public void setEditData(JSONObject editData) {
		this.editData = editData;
	}

	public String edit(){
		System.err.println("edit="+warden.getwId());
		editData = wardenService.findById(warden.getwId());
		return SUCCESS;
		
	}
	
	
	
	/**
	 * �޸Ĺ���Ա��Ϣ
	 * @return
	 */
	public String update(){
		//warden = (Warden) ActionContext.getContext().getSession().get("warden");
		int u = 0;
		u = wardenService.update(warden);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(u);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("u="+u);
		return NONE;
	}
	/**
	 * �����޸ĺ����Ϣ
	 * @return
	 */
	public String updateto(){
		wardenService.update(warden);
		this.addActionMessage("�޸ĳɹ���");
		return "updateto";
	}
	
	/**
	 * ��ȡ������Ϣ
	 * @return
	 */
	//������json����
	private JSONArray tree = null;
	public JSONArray getTree() {
		return tree;
	}
	public void setTree(JSONArray tree) {
		this.tree = tree;
	}
	//���Ľڵ�id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNav(){
		tree = wardenService.getNav(id);
		System.err.println("id="+id);
		return SUCCESS;
	}
	/**
	 * �������Ա��Ϣ
	 * @return
	 */
	//��̨�������� ��ǰҳ ÿҳ��ʾ�� �����ֶ� ˳��
	//private PageBean pb = new PageBean();
	private int rows;
	private int page;
	private String sort;
	private String order;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
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
	//ǰ̨����json���
	private JSONObject mwa = null;
	public JSONObject getMwa() {
		return mwa;
	}
	public void setMwa(JSONObject mwa) {
		this.mwa = mwa;
	}
	public String mWarden(){
		int first = rows * (page - 1);
		/*System.err.println("��һ�Σ�"+rows);
		System.err.println("��er�Σ�"+page);
		System.err.println("��san�Σ�"+sort);
		System.err.println("��si�Σ�"+order);
		System.err.println("����Σ�"+warden.getwName());*/
		mwa = wardenService.show(first,rows,sort,order ,warden.getwName());
		return SUCCESS;
	}
	/**
	 * ɾ������Ա��Ϣ
	 * @return
	 */
	//����ids
	private String ids=null;
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String delete(){
		int count = wardenService.delete(ids);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(count);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
}
