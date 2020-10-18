package com.pluto.www.service;

import com.pluto.www.bean.UserAddress;

import java.util.List;

// 用户服务接口
public interface UserService {
    /**
     * 按照用户id返回所有的收获地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
