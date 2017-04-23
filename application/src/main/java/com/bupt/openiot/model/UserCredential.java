package com.bupt.openiot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_credentials")
public class UserCredential {
    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "usercredentialId")
    private String usercredentialid;

    @Column(name = "createdTime")
    private Long createdtime;

    @Column(name = "userId")
    private String userid;

    private Boolean enable;

    private String password;

    @Column(name = "activateToken")
    private String activatetoken;

    @Column(name = "resetToken")
    private String resettoken;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsercredentialid() {
        return usercredentialid;
    }

    public void setUsercredentialid(String usercredentialid) {
        this.usercredentialid = usercredentialid;
    }

    public Long getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Long createdtime) {
        this.createdtime = createdtime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivatetoken() {
        return activatetoken;
    }

    public void setActivatetoken(String activatetoken) {
        this.activatetoken = activatetoken;
    }

    public String getResettoken() {
        return resettoken;
    }

    public void setResettoken(String resettoken) {
        this.resettoken = resettoken;
    }
}