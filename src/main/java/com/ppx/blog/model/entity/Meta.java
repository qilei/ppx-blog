package com.ppx.blog.model.entity;

import java.io.Serializable;

public class Meta implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目缩略名
     */
    private String slug;

    /**
     * 项目类型
     */
    private String type;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目排序
     */
    private Integer sort;

    /**
     * 父级
     */
    private Integer parent;

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
     * 获取项目名称
     *
     * @return name - 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置项目名称
     *
     * @param name 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取项目缩略名
     *
     * @return slug - 项目缩略名
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 设置项目缩略名
     *
     * @param slug 项目缩略名
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 获取项目类型
     *
     * @return type - 项目类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置项目类型
     *
     * @param type 项目类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取项目描述
     *
     * @return description - 项目描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置项目描述
     *
     * @param description 项目描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取项目排序
     *
     * @return sort - 项目排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置项目排序
     *
     * @param sort 项目排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取父级
     *
     * @return parent - 父级
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 设置父级
     *
     * @param parent 父级
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }
}