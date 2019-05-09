package com.flycms.module.user.model;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Open source house, All rights reserved
 * 版权：28844.com<br/>
 * 开发公司：28844.com<br/>
 *
 * @author sun-kaifei
 * @version 1.0 <br/>
 * @email 79678111@qq.com
 * @Date: 10:59 2018/9/25
 */
public class UserCount implements Serializable {
    private static final long serialVersionUID = 1L;
    //id
    private Long userId;
    //发布问题数量
    private Integer countQuestion;
    //关注的问题数量
    private Integer countQuestionFollw;
    //关注话题数量
    private Integer countTopic;
    //回答问题数量
    private Integer countAnswer;
    //所有粉丝数量
    private Integer countFans;
    //关注数量
    private Integer countFollw;
    //发布文章数量
    private Integer countArticle;
    //发布分享数量
    private Integer countShare;
    private BigDecimal balance;
    private Integer score;
    private Integer exp;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getCountQuestion() {
		return countQuestion;
	}
	public void setCountQuestion(Integer countQuestion) {
		this.countQuestion = countQuestion;
	}
	public Integer getCountQuestionFollw() {
		return countQuestionFollw;
	}
	public void setCountQuestionFollw(Integer countQuestionFollw) {
		this.countQuestionFollw = countQuestionFollw;
	}
	public Integer getCountTopic() {
		return countTopic;
	}
	public void setCountTopic(Integer countTopic) {
		this.countTopic = countTopic;
	}
	public Integer getCountAnswer() {
		return countAnswer;
	}
	public void setCountAnswer(Integer countAnswer) {
		this.countAnswer = countAnswer;
	}
	public Integer getCountFans() {
		return countFans;
	}
	public void setCountFans(Integer countFans) {
		this.countFans = countFans;
	}
	public Integer getCountFollw() {
		return countFollw;
	}
	public void setCountFollw(Integer countFollw) {
		this.countFollw = countFollw;
	}
	public Integer getCountArticle() {
		return countArticle;
	}
	public void setCountArticle(Integer countArticle) {
		this.countArticle = countArticle;
	}
	public Integer getCountShare() {
		return countShare;
	}
	public void setCountShare(Integer countShare) {
		this.countShare = countShare;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
    
    
}
