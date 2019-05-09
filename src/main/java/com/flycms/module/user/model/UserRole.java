package com.flycms.module.user.model;


import java.io.Serializable;
import java.util.Date;

public class UserRole implements Serializable {
    private static final long serialVersionUID = 1L;
    //用户id
    private Long userId;
    //用户组id
    private Long groupId;
    //服务开始时间
    private Date serveStartTime;
    //服务结束时间
    private Date serveEndTime;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Date getServeStartTime() {
		return serveStartTime;
	}
	public void setServeStartTime(Date serveStartTime) {
		this.serveStartTime = serveStartTime;
	}
	public Date getServeEndTime() {
		return serveEndTime;
	}
	public void setServeEndTime(Date serveEndTime) {
		this.serveEndTime = serveEndTime;
	}
    
}
