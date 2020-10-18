package com.pluto.www.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pluto.www.bean.UserAddress;
import com.pluto.www.service.OrderService;
import com.pluto.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// OrderServiceImpl：服务方提供实现接口(UserService)
@Service // 使用spring的注解将OrderServiceImpl注入到容器中
//@org.springframework.stereotype.Service("orderService")
@Component("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired //使用Autowired将UserService注入进来，UserService已经在consumer.xml配置后已经在容器中了

    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户id：" + userId);

        List<UserAddress> addressList = userService.getUserAddressList(userId);

        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }

    }
}