package com.pluto.gmall.service.impl;

import com.pluto.www.bean.UserAddress;
import com.pluto.www.service.UserService;

import java.util.Arrays;
import java.util.List;

// UserServiceImpl：服务方提供实现接口(UserService)
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId){
        UserAddress address1 = new UserAddress(1,"北京","1","beijing","1234567891","Y");
        UserAddress address2 = new UserAddress(1,"上海","2","shanghai","1234567892","N");
        return Arrays.asList(address1,address2);
    }
}