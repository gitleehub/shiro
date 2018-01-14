package com.lee.spring.shiro.dao;

import java.util.List;

import com.lee.spring.shiro.bean.Role;

public interface RoleDao {

	List<Role> queryRolesByLoginacct(String loginacct);

}
