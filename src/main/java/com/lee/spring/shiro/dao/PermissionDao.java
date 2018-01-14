package com.lee.spring.shiro.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lee.spring.shiro.bean.Permission;
import com.lee.spring.shiro.bean.Role;

public interface PermissionDao {

	List<Permission> queryPermissionsByRoles(@Param("roles")List<Role> roles);

}
