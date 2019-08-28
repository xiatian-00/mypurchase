package com.shop.purchase.mapper;

import com.shop.purchase.domain.Users;

/**
  *@author summer
  *@date 2019-8-28 12:44
  */ 
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}