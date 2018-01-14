package com.lee.spring.shiro.service;

import com.lee.spring.shiro.bean.User;

public interface UserService {

	User queryUserByLoginacct(String loginacct);

}
