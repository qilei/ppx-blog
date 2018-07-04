package com.ppx.blog.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Content implements Serializable {
    /**
     * 文章表主键
     */
    private Integer cid;

    /**
     * 标题
     */
    private String title;

    /**
     * 缩略名
     */
    private String slug;

    /**
     * 文章缩略图
     */
    private String thumbImg;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date modified;

    /**
     * 创建用户
     */
    private Integer authorId;

    /**
     * 文章类型： PAGE、POST
     */
    private String type;

    /**
     * 内容状态
     */
    private String status;

    /**
     * 内容类型，markdown或者html
     */
    private String fmtType;

    /**
     * 标签列表
     */
    private String tags;

    /**
     * 分类列表
     */
    private String categories;

    /**
     * 文章点击次数
     */
    private Integer hits;

    /**
     * 内容所属评论数
     */
    private Integer commentsNum;

    /**
     * 是否允许评论
     */
    private Integer allowComment;

    /**
     * 是否允许ping
     */
    private Integer allowPing;

    /**
     * 允许出现在Feed中
     */
    private Integer allowFeed;

    /**
     * 内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取文章表主键
     *
     * @return cid - 文章表主键
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置文章表主键
     *
     * @param cid 文章表主键
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取缩略名
     *
     * @return slug - 缩略名
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 设置缩略名
     *
     * @param slug 缩略名
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 获取文章缩略图
     *
     * @return thumb_img - 文章缩略图
     */
    public String getThumbImg() {
        return thumbImg;
    }

    /**
     * 设置文章缩略图
     *
     * @param thumbImg 文章缩略图
     */
    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
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
     * 获取更新时间
     *
     * @return modified - 更新时间
     */
    public Date getModified() {
        return modified;
    }

    /**
     * 设置更新时间
     *
     * @param modified 更新时间
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 获取创建用户
     *
     * @return author_id - 创建用户
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置创建用户
     *
     * @param authorId 创建用户
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取文章类型： PAGE、POST
     *
     * @return type - 文章类型： PAGE、POST
     */
    public String getType() {
        return type;
    }

    /**
     * 设置文章类型： PAGE、POST
     *
     * @param type 文章类型： PAGE、POST
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取内容状态
     *
     * @return status - 内容状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置内容状态
     *
     * @param status 内容状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取内容类型，markdown或者html
     *
     * @return fmt_type - 内容类型，markdown或者html
     */
    public String getFmtType() {
        return fmtType;
    }

    /**
     * 设置内容类型，markdown或者html
     *
     * @param fmtType 内容类型，markdown或者html
     */
    public void setFmtType(String fmtType) {
        this.fmtType = fmtType;
    }

    /**
     * 获取标签列表
     *
     * @return tags - 标签列表
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置标签列表
     *
     * @param tags 标签列表
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取分类列表
     *
     * @return categories - 分类列表
     */
    public String getCategories() {
        return categories;
    }

    /**
     * 设置分类列表
     *
     * @param categories 分类列表
     */
    public void setCategories(String categories) {
        this.categories = categories;
    }

    /**
     * 获取文章点击次数
     *
     * @return hits - 文章点击次数
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * 设置文章点击次数
     *
     * @param hits 文章点击次数
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * 获取内容所属评论数
     *
     * @return comments_num - 内容所属评论数
     */
    public Integer getCommentsNum() {
        return commentsNum;
    }

    /**
     * 设置内容所属评论数
     *
     * @param commentsNum 内容所属评论数
     */
    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    /**
     * 获取是否允许评论
     *
     * @return allow_comment - 是否允许评论
     */
    public Integer getAllowComment() {
        return allowComment;
    }

    /**
     * 设置是否允许评论
     *
     * @param allowComment 是否允许评论
     */
    public void setAllowComment(Integer allowComment) {
        this.allowComment = allowComment;
    }

    /**
     * 获取是否允许ping
     *
     * @return allow_ping - 是否允许ping
     */
    public Integer getAllowPing() {
        return allowPing;
    }

    /**
     * 设置是否允许ping
     *
     * @param allowPing 是否允许ping
     */
    public void setAllowPing(Integer allowPing) {
        this.allowPing = allowPing;
    }

    /**
     * 获取允许出现在Feed中
     *
     * @return allow_feed - 允许出现在Feed中
     */
    public Integer getAllowFeed() {
        return allowFeed;
    }

    /**
     * 设置允许出现在Feed中
     *
     * @param allowFeed 允许出现在Feed中
     */
    public void setAllowFeed(Integer allowFeed) {
        this.allowFeed = allowFeed;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}