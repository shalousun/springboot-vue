package com.boco.demo.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;


/**
 * Table:
 * Created by ApplicationPower.
 * @author yu on 2017-11-22 19:47:23.
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = -7374557626135330615L;

   	//用户ID
	private Integer id;
	//职工id：通过职工页面分配的用户所关联的职工id
	private Integer staffId;
	//真实姓名
	private String realName;
	//所属机构id
	private Integer orgId;
	//部门编号
	private Integer departmentCode;
	//用户名(登录名)
	private String name;
	//密码
	private String password;
	//密码找回问题
	private String problem;
	//密码找回问题的答案
	private String answer;
	//新增人
	private String insertOperator;
	//新增时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp insertDatetime;
	//最后更新者
	private String lastModifyOperator;
	//最后变更时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp lastModifyDatetime;
	//删除标识：0:正常数据，1:逻辑删除数据
	private Integer delFlag;
	//备注
	private String memo;
	//??λ: 1-?쵼???? 2-???ż???3-?û???
	private String post;

	//getters and setters
   	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getInsertOperator() {
		return insertOperator;
	}

	public void setInsertOperator(String insertOperator) {
		this.insertOperator = insertOperator;
	}

	public Timestamp getInsertDatetime() {
		return insertDatetime;
	}

	public void setInsertDatetime(Timestamp insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public String getLastModifyOperator() {
		return lastModifyOperator;
	}

	public void setLastModifyOperator(String lastModifyOperator) {
		this.lastModifyOperator = lastModifyOperator;
	}

	public Timestamp getLastModifyDatetime() {
		return lastModifyDatetime;
	}

	public void setLastModifyDatetime(Timestamp lastModifyDatetime) {
		this.lastModifyDatetime = lastModifyDatetime;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}


    @Override
    public String toString() {
        return "SysUser{" + 
                "id =" + id +
                ",staffId =" + staffId +
                ",realName ='" + realName + '\'' +
                ",orgId =" + orgId +
                ",departmentCode =" + departmentCode +
                ",name ='" + name + '\'' +
                ",password ='" + password + '\'' +
                ",problem ='" + problem + '\'' +
                ",answer ='" + answer + '\'' +
                ",insertOperator ='" + insertOperator + '\'' +
                ",insertDatetime =" + insertDatetime +
                ",lastModifyOperator ='" + lastModifyOperator + '\'' +
                ",lastModifyDatetime =" + lastModifyDatetime +
                ",delFlag =" + delFlag +
                ",memo ='" + memo + '\'' +
                ",post ='" + post + '\'' +
                '}';
    }
}