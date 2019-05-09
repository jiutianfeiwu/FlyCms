package com.flycms.module.user.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Open source house, All rights reserved
 * 版权：28844.com<br/>
 * 开发公司：28844.com<br/>
 *
 * @author sun-kaifei
 * @version 1.0 <br/>
 * @email 79678111@qq.com
 * @Date: 23:23 2018/9/14
 */
public class UserFans implements Serializable {
    private static final long serialVersionUID = 1L;
    //id
    private Long id;
    //被关注者用户id
    private Long userFollow;
    //粉丝id，关注者的id
    private Long userFans;
    //信息id
    private Date createTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserFollow() {
		return userFollow;
	}
	public void setUserFollow(Long userFollow) {
		this.userFollow = userFollow;
	}
	public Long getUserFans() {
		return userFans;
	}
	public void setUserFans(Long userFans) {
		this.userFans = userFans;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}
