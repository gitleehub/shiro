package com.lee.spring.shiro.service;

import java.util.List;

import com.lee.spring.shiro.bean.Role;

public interface RoleService {

	List<Role> queryRolesByLoginacct(String loginacct);

}
