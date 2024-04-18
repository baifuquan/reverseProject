package com/msb/mapper;

import com/msb/pojo.Projects;

public interface ProjectsMapper {
    int insert(Projects record);

    int insertSelective(Projects record);
}