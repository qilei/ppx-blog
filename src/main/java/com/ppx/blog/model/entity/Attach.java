package com.ppx.blog.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Attach implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 文件名称
     */
    private String fname;

    /**
     * 文件类型
     */
    private String ftype;

    /**
     * 文件key
     */
    private String fkey;

    /**
     * 作者
     */
    private Integer authorId;

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
     * 获取文件名称
     *
     * @return fname - 文件名称
     */
    public String getFname() {
        return fname;
    }

    /**
     * 设置文件名称
     *
     * @param fname 文件名称
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * 获取文件类型
     *
     * @return ftype - 文件类型
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * 设置文件类型
     *
     * @param ftype 文件类型
     */
    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    /**
     * 获取文件key
     *
     * @return fkey - 文件key
     */
    public String getFkey() {
        return fkey;
    }

    /**
     * 设置文件key
     *
     * @param fkey 文件key
     */
    public void setFkey(String fkey) {
        this.fkey = fkey;
    }

    /**
     * 获取作者
     *
     * @return author_id - 作者
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置作者
     *
     * @param authorId 作者
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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