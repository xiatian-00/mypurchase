package com.shop.purchase.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.shop.purchase.mapper.UsersMapper;
import com.shop.purchase.domain.Users;
import com.shop.purchase.service.UsersService;
/**
  *@author summer
  *@date 2019-8-28 12:44
  */ 
@Service
public class UsersServiceImpl implements UsersService{

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

}
