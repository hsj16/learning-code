package com.hsj.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsj.demo.mapper.UserMapper;

@Repository
public class UserDao {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public void getUser() {
		userMapper.getUser();

		sessionTemplate.selectList("com.hsj.demo.mapper.UserMapper.getUser");

		// jdbcTemplate.execute("");
	}

}
