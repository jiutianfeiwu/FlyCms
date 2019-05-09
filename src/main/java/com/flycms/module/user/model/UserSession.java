package com.flycms.module.user.model;


import java.io.Serializable;
import java.util.Date;

public class UserSession implements Serializable {
    private static final long serialVersionUID = 1L;
    //用户sessionKey
    private String sessionKey;
    //用户组id
    private Long userId;
    //服务开始时间
    private long expireTime;
    //最后更新时间
    private Date updateTime;
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public long getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(long expireTime) {
		this.expireTime = expireTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
