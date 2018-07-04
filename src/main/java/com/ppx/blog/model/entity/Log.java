package com.ppx.blog.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 动作
     */
    private String action;

    /**
     * 数据
     */
    private String data;

    /**
     * 发生人id
     */
    private Integer authorId;

    /**
     * ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date created;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取动作
     *
     * @return action - 动作
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置动作
     *
     * @param action 动作
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 获取数据
     *
     * @return data - 数据
     */
    public String getData() {
        return data;
    }

    /**
     * 设置数据
     *
     * @param data 数据
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 获取发生人id
     *
     * @return author_id - 发生人id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置发生人id
     *
     * @param authorId 发生人id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取ip
     *
     * @return ip - ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置ip
     *
     * @param ip ip
     */
    public void setIp(String ip) {
        this.ip = ip;
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
}