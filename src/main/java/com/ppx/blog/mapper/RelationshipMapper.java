package com.ppx.blog.mapper;

import com.ppx.blog.model.entity.Relationship;

public interface RelationshipMapper {
    int insert(Relationship record);

    int insertSelective(Relationship record);
}