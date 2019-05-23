package com.point.kmss.example.service.impl;

import com.point.kmss.example.common.Const;
import com.point.kmss.example.common.ResponseCode;
import com.point.kmss.example.common.ServerResponse;
import com.point.kmss.example.dao.MmallUserMapper;
import com.point.kmss.example.models.MmallUser;
import com.point.kmss.example.service.IUserService;
import com.point.kmss.example.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Park on 2019-5-23.
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private MmallUserMapper userMapper;
    @Override
    public ServerResponse register(MmallUser user) {
        if(user ==null){
            return ServerResponse.createByErrorMessage("注册用户不能为空！");
        }
        //根据用户名验证用户
        String username = user.getUsername();
        int rowCount = userMapper.selectByUsername(username);
        if(rowCount>0){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.Error.getCode(),"注册用户已存在！");
        }
        //根据邮箱验证用户
        String email = user.getEmail();
        rowCount = userMapper.selectByEmail(email);
        if(rowCount>0){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.Error.getCode(),"注册邮箱已存在！");
        }
        //密码MD5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        //设置用户角色
        user.setRole(Const.role.ROLE_CUSTOMER);
        int count = userMapper.insert(user);
        if(count<1){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.Error.getCode(),"注册失败！");
        }
        return ServerResponse.createBySuccessMessage("注册成功！");
    }

    @Override
    public ServerResponse login(String username, String password) {
        return null;
    }
}
