package com.flycms.module.user.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Open source house, All rights reserved
 * 版权：28844.com<br/>
 * 开发公司：开源之家<br/>
 *
 * @author sun-kaifei
 * @version 1.0 <br/>
 * @email 79678111@qq.com
 * @Date: 12:07 2018/8/21
 */

public class UserInvite implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    //被邀请人ID
    private Long toUserId;
    //邀请人ID
    private Long formUserId;
    //状态
    private Integer status;
    private Date createTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getToUserId() {
		return toUserId;
	}
	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}
	public Long getFormUserId() {
		return formUserId;
	}
	public void setFormUserId(Long formUserId) {
		this.formUserId = formUserId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
