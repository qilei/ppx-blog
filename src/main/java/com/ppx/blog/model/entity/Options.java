package com.ppx.blog.model.entity;

import java.io.Serializable;

public class Options implements Serializable {
    /**
     * 配置键
     */
    private String name;

    /**
     * 配置描述
     */
    private String description;

    /**
     * 配置值
     */
    private String value;

    private static final long serialVersionUID = 1L;

    /**
     * 获取配置键
     *
     * @return name - 配置键
     */
    public String getName() {
        return name;
    }

    /**
     * 设置配置键
     *
     * @param name 配置键
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取配置描述
     *
     * @return description - 配置描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置配置描述
     *
     * @param description 配置描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取配置值
     *
     * @return VALUE - 配置值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置配置值
     *
     * @param value 配置值
     */
    public void setValue(String value) {
        this.value = value;
    }
}