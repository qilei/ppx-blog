package com.ppx.blog.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * 主键
     */
    private Integer coid;

    /**
     * post表主键,关联字段
     */
    private Integer cid;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 评论作者
     */
    private String author;

    /**
     * 评论所属用户id
     */
    private Integer authorId;

    /**
     * 评论所属内容作者id
     */
    private Integer ownerId;

    /**
     * 评论者邮件
     */
    private String mail;

    /**
     * 评论者网址
     */
    private String url;

    /**
     * 评论者ip地址
     */
    private String ip;

    /**
     * 评论者客户端
     */
    private String agent;

    /**
     * 评论类型
     */
    private String type;

    /**
     * 评论状态
     */
    private String status;

    /**
     * 父级评论
     */
    private Integer parent;

    /**
     * 评论内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return coid - 主键
     */
    public Integer getCoid() {
        return coid;
    }

    /**
     * 设置主键
     *
     * @param coid 主键
     */
    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    /**
     * 获取post表主键,关联字段
     *
     * @return cid - post表主键,关联字段
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置post表主键,关联字段
     *
     * @param cid post表主键,关联字段
     */
    public void setCid(Integer cid) {
        this.cid = cid;
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
     * 获取评论作者
     *
     * @return author - 评论作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置评论作者
     *
     * @param author 评论作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取评论所属用户id
     *
     * @return author_id - 评论所属用户id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置评论所属用户id
     *
     * @param authorId 评论所属用户id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取评论所属内容作者id
     *
     * @return owner_id - 评论所属内容作者id
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * 设置评论所属内容作者id
     *
     * @param ownerId 评论所属内容作者id
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 获取评论者邮件
     *
     * @return mail - 评论者邮件
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置评论者邮件
     *
     * @param mail 评论者邮件
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取评论者网址
     *
     * @return url - 评论者网址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置评论者网址
     *
     * @param url 评论者网址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取评论者ip地址
     *
     * @return ip - 评论者ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置评论者ip地址
     *
     * @param ip 评论者ip地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取评论者客户端
     *
     * @return agent - 评论者客户端
     */
    public String getAgent() {
        return agent;
    }

    /**
     * 设置评论者客户端
     *
     * @param agent 评论者客户端
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /**
     * 获取评论类型
     *
     * @return type - 评论类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置评论类型
     *
     * @param type 评论类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取评论状态
     *
     * @return status - 评论状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置评论状态
     *
     * @param status 评论状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取父级评论
     *
     * @return parent - 父级评论
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 设置父级评论
     *
     * @param parent 父级评论
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}