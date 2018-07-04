package com.ppx.blog.model.entity;

import java.io.Serializable;

public class Relationship implements Serializable {
    /**
     * 文章主键
     */
    private Integer cid;

    /**
     * 项目主键
     */
    private Integer mid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取文章主键
     *
     * @return cid - 文章主键
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置文章主键
     *
     * @param cid 文章主键
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取项目主键
     *
     * @return mid - 项目主键
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置项目主键
     *
     * @param mid 项目主键
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }
}