package com.point.kmss.example.service;

import com.point.kmss.example.common.ServerResponse;
import com.point.kmss.example.models.MmallUser;

/**
 * Created by Park on 2019-5-23.
 */
public interface IUserService {
    /**
     * 用户注册
     * @param user
     * @return
     */
    public ServerResponse register(MmallUser user);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public ServerResponse login(String username,String password);
}
