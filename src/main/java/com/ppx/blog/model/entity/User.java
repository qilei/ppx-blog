package com.ppx.blog.model.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * id
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 网址
     */
    private String homeUrl;

    /**
     * 用户显示的名称
     */
    private String screenName;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 最后活动时间
     */
    private Date activated;

    /**
     * 上次登录最后活跃时间
     */
    private Date logged;

    /**
     * 用户组
     */
    private String groupName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return uid - id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置id
     *
     * @param uid id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取网址
     *
     * @return home_url - 网址
     */
    public String getHomeUrl() {
        return homeUrl;
    }

    /**
     * 设置网址
     *
     * @param homeUrl 网址
     */
    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    /**
     * 获取用户显示的名称
     *
     * @return screen_name - 用户显示的名称
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * 设置用户显示的名称
     *
     * @param screenName 用户显示的名称
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取最后活动时间
     *
     * @return activated - 最后活动时间
     */
    public Date getActivated() {
        return activated;
    }

    /**
     * 设置最后活动时间
     *
     * @param activated 最后活动时间
     */
    public void setActivated(Date activated) {
        this.activated = activated;
    }

    /**
     * 获取上次登录最后活跃时间
     *
     * @return logged - 上次登录最后活跃时间
     */
    public Date getLogged() {
        return logged;
    }

    /**
     * 设置上次登录最后活跃时间
     *
     * @param logged 上次登录最后活跃时间
     */
    public void setLogged(Date logged) {
        this.logged = logged;
    }

    /**
     * 获取用户组
     *
     * @return group_name - 用户组
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置用户组
     *
     * @param groupName 用户组
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}