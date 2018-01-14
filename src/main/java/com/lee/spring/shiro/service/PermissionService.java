package com.lee.spring.shiro.service;

import java.util.List;

import com.lee.spring.shiro.bean.Permission;
import com.lee.spring.shiro.bean.Role;

public interface PermissionService {

	List<Permission> queryPermissionsByRoles(List<Role> roles);

}
