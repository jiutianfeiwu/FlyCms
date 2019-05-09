package com.flycms.module.user.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Open source house, All rights reserved
 * 开发公司：28844.com<br/>
 * 版权：开源中国<br/>
 *
 * @author sun-kaifei
 * @version 1.0 <br/>
 * @email 79678111@qq.com
 * @Date: 20:28 2018/8/26
 */
public class UserActivation implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String code;
    private Integer codeType;
    private Date referTime;
    private Integer referStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getCodeType() {
		return codeType;
	}
	public void setCodeType(Integer codeType) {
		this.codeType = codeType;
	}
	public Date getReferTime() {
		return referTime;
	}
	public void setReferTime(Date referTime) {
		this.referTime = referTime;
	}
	public Integer getReferStatus() {
		return referStatus;
	}
	public void setReferStatus(Integer referStatus) {
		this.referStatus = referStatus;
	}
    
}
