package com.hua.shi.rmd.domain.entity.user;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_code
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.pb_branch_no
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String pbBranchNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.branch_id
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private Integer branchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.wokr_no
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String wokrNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.idno
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String idno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gender
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.birhday
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String birhday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.education
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String education;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.adress
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String adress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.mobile
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.mail
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_pwd
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private String userPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_at
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private Integer createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_time
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_code
     *
     * @return the value of t_user.user_code
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_code
     *
     * @param userCode the value for t_user.user_code
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.pb_branch_no
     *
     * @return the value of t_user.pb_branch_no
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getPbBranchNo() {
        return pbBranchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.pb_branch_no
     *
     * @param pbBranchNo the value for t_user.pb_branch_no
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setPbBranchNo(String pbBranchNo) {
        this.pbBranchNo = pbBranchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.branch_id
     *
     * @return the value of t_user.branch_id
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public Integer getBranchId() {
        return branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.branch_id
     *
     * @param branchId the value for t_user.branch_id
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.wokr_no
     *
     * @return the value of t_user.wokr_no
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getWokrNo() {
        return wokrNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.wokr_no
     *
     * @param wokrNo the value for t_user.wokr_no
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setWokrNo(String wokrNo) {
        this.wokrNo = wokrNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.idno
     *
     * @return the value of t_user.idno
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getIdno() {
        return idno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.idno
     *
     * @param idno the value for t_user.idno
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setIdno(String idno) {
        this.idno = idno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gender
     *
     * @return the value of t_user.gender
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gender
     *
     * @param gender the value for t_user.gender
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.birhday
     *
     * @return the value of t_user.birhday
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getBirhday() {
        return birhday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.birhday
     *
     * @param birhday the value for t_user.birhday
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setBirhday(String birhday) {
        this.birhday = birhday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.education
     *
     * @return the value of t_user.education
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.education
     *
     * @param education the value for t_user.education
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.adress
     *
     * @return the value of t_user.adress
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getAdress() {
        return adress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.adress
     *
     * @param adress the value for t_user.adress
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.mobile
     *
     * @return the value of t_user.mobile
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.mobile
     *
     * @param mobile the value for t_user.mobile
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.mail
     *
     * @return the value of t_user.mail
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.mail
     *
     * @param mail the value for t_user.mail
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_pwd
     *
     * @return the value of t_user.user_pwd
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_pwd
     *
     * @param userPwd the value for t_user.user_pwd
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_at
     *
     * @return the value of t_user.create_at
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public Integer getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_at
     *
     * @param createAt the value for t_user.create_at
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_time
     *
     * @return the value of t_user.create_time
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_time
     *
     * @param createTime the value for t_user.create_time
     *
     * @mbg.generated Sun Nov 22 18:48:15 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}