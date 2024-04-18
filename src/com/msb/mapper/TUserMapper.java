package com/msb/mapper;

import com/msb/pojo.TUser;

public interface TUserMapper {
    int insert(TUser record);

    int insertSelective(TUser record);
}