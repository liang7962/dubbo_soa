package com.jin.pojo;


import java.io.Serializable;
import java.util.Date;

public class Individual implements Serializable {

    private static final long serialVersionUID = 352916620;

    private Integer   id;
    private String    userName;
    private String    userPassword;
    private String    userNiceName;
    private String    userImgUrl;
    private String    phoneNumber;
    private Date      userBirthday;
    private Date utime;
    private Date ctime;
    private String    role;

    public Individual() {}

    public Individual(Individual value) {
        this.id = value.id;
        this.userName = value.userName;
        this.userPassword = value.userPassword;
        this.userNiceName = value.userNiceName;
        this.userImgUrl = value.userImgUrl;
        this.phoneNumber = value.phoneNumber;
        this.userBirthday = value.userBirthday;
        this.utime = value.utime;
        this.ctime = value.ctime;
        this.role = value.role;
    }

    public Individual(
        Integer   id,
        String    userName,
        String    userPassword,
        String    userNiceName,
        String    userImgUrl,
        String    phoneNumber,
        Date      userBirthday,
        Date utime,
        Date ctime,
        String    role
    ) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNiceName = userNiceName;
        this.userImgUrl = userImgUrl;
        this.phoneNumber = phoneNumber;
        this.userBirthday = userBirthday;
        this.utime = utime;
        this.ctime = ctime;
        this.role = role;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNiceName() {
        return this.userNiceName;
    }

    public void setUserNiceName(String userNiceName) {
        this.userNiceName = userNiceName;
    }

    public String getUserImgUrl() {
        return this.userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getUserBirthday() {
        return this.userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getUtime() {
        return this.utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Date getCtime() {
        return this.ctime;
    }

    public void setCtime(Date date) {
        this.ctime = date;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Individual (");

        sb.append(id);
        sb.append(", ").append(userName);
        sb.append(", ").append(userPassword);
        sb.append(", ").append(userNiceName);
        sb.append(", ").append(userImgUrl);
        sb.append(", ").append(phoneNumber);
        sb.append(", ").append(userBirthday);
        sb.append(", ").append(utime);
        sb.append(", ").append(ctime);
        sb.append(", ").append(role);

        sb.append(")");
        return sb.toString();
    }
}
