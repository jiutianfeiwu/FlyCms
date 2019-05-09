package com.flycms.module.user.model;


import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * Open source house, All rights reserved
 * 开发公司：28844.com<br/>
 * 版权：开源中国<br/>
 *
 * @author sun-kaifei
 * @version 1.0 <br/>
 * @email 79678111@qq.com
 * @Date: 12:07 2018/8/1
 */
public class UserGroup implements Serializable {
    private Long id;
    @NotEmpty(message="用户组名不能为空")
    private String groupName;

    private BigDecimal discount;

    private Integer minexp;

    private Integer maxexp;

    private String messageIds;
    //排序
    private Integer sort;

    private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public Integer getMinexp() {
		return minexp;
	}

	public void setMinexp(Integer minexp) {
		this.minexp = minexp;
	}

	public Integer getMaxexp() {
		return maxexp;
	}

	public void setMaxexp(Integer maxexp) {
		this.maxexp = maxexp;
	}

	public String getMessageIds() {
		return messageIds;
	}

	public void setMessageIds(String messageIds) {
		this.messageIds = messageIds;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
    

}