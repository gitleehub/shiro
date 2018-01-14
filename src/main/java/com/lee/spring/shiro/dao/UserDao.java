package com.lee.spring.shiro.dao;

import org.apache.ibatis.annotations.Select;

import com.lee.spring.shiro.bean.User;

public interface UserDao {

	@Select("select * from t_user where loginacct = #{loginacct}")
	User queryUserByLoginacct(String loginacct);

}
