package com.flycms.module.user.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    //用户id
    private Long userId;
    //短域名
    private String shortUrl;
    //用户名,可做登录使用
    private String userName;
    //手机号码,可做登录使用
    private String userMobile;
    //联系邮箱,可做登录使用
    private String userEmail;
    //密码
    private String password;
    //确认密码
    private String repassword;
    //用户昵称
    private String nickName;
    //姓名
    private String trueName;
    //用户头像
    private String avatar;
    //个性签名
    private String signature;
    //工作职业
    private String work;
    //自我介绍
    private String description;
    //座机号码
    private String telephone;
    //省份id
    private Integer province;
    //地区id
    private Integer city;
    //县市id
    private Integer area;
    //详细地址
    private String contactAddr;
    //邮政编码
    private String zip;
    //联系qq号码
    private String qq;
    //性别
    private Integer sex;
    //生日
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    //所在的会员组
        private Long groupId;
    //经验值
    private Integer exp;
    //所有提的问题数量
    private Integer countQuestion;
    //所有关注的问题数量
    private Integer countQuestionFollw;
    //发布文章数量
    private Integer countArticle;
    //所有关注话题的数量
    private Integer countTopic;
    //所有回答的数量
    private Integer countAnswer;
    //关注别人的数量
    private Integer countFollw;
    //所有的粉丝数量
    private Integer countFans;
    //注册时间
    private Date createTime;
    //账户剩余金额
    private BigDecimal balance;
    //积分
    private Integer score;
    //成功登陆最后时间
    private Date lastLogin;
    private String custom;
    //成功登陆最后ip
    private String loginIp;
    //尝试登陆次数
    private Integer attempts;
    //尝试登陆最后时间
    private Date attemptsTime;
    //审核状态
    private Integer status;
    //用户sessionKey
    private String sessionKey;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getContactAddr() {
		return contactAddr;
	}
	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
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
	public Integer getCountArticle() {
		return countArticle;
	}
	public void setCountArticle(Integer countArticle) {
		this.countArticle = countArticle;
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
	public Integer getCountFollw() {
		return countFollw;
	}
	public void setCountFollw(Integer countFollw) {
		this.countFollw = countFollw;
	}
	public Integer getCountFans() {
		return countFans;
	}
	public void setCountFans(Integer countFans) {
		this.countFans = countFans;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public Integer getAttempts() {
		return attempts;
	}
	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}
	public Date getAttemptsTime() {
		return attemptsTime;
	}
	public void setAttemptsTime(Date attemptsTime) {
		this.attemptsTime = attemptsTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
    
    
}
