package com.mapper.example.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user login info`")
public class UserLoginInfo {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    private String username;

    private Date logindate;

    private String loginip;

    /**
     * @return Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return logindate
     */
    public Date getLogindate() {
        return logindate;
    }

    /**
     * @param logindate
     */
    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    /**
     * @return loginip
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * @param loginip
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }
}