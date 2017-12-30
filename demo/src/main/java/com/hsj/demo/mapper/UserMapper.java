package com.hsj.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hsj.demo.springbeans.bean.User;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	List<User> getUser();

}
