package com.ppx.blog.mapper;

import com.ppx.blog.model.entity.Options;

import java.util.List;

public interface OptionsMapper {
    int deleteByPrimaryKey(String name);

    int insert(Options record);

    Options selectByPrimaryKey(String name);

    List<Options> selectAll();

    int updateByPrimaryKey(Options record);
}