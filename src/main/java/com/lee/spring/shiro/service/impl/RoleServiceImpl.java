package com.lee.spring.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.spring.shiro.bean.Role;
import com.lee.spring.shiro.dao.RoleDao;
import com.lee.spring.shiro.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public List<Role> queryRolesByLoginacct(String loginacct) {
		return roleDao.queryRolesByLoginacct(loginacct);
	}
}
