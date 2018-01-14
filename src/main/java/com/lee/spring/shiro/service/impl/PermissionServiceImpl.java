package com.lee.spring.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.spring.shiro.bean.Permission;
import com.lee.spring.shiro.bean.Role;
import com.lee.spring.shiro.dao.PermissionDao;
import com.lee.spring.shiro.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionDao permissionDao;

	@Override
	public List<Permission> queryPermissionsByRoles(List<Role> roles) {
		return permissionDao.queryPermissionsByRoles(roles);
	}
}
