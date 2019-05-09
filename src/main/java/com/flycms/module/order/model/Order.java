package com.flycms.module.order.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * Open source house, All rights reserved
 * 版权：28844.com<br/>
 * 开发公司：28844.com<br/>
 *
 * 订单实体类
 *
 * @author sun-kaifei
 * @version 1.0 <br/>
 * @email 79678111@qq.com
 * @Date: 14:52 2018/9/11
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long shareId;
    private Long userId;
    private Integer status;
    private Date createTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getShareId() {
		return shareId;
	}
	public void setShareId(Long shareId) {
		this.shareId = shareId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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