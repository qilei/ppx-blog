package com.ppx.blog.mapper;

import com.ppx.blog.model.entity.Comment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer coid);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer coid);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}