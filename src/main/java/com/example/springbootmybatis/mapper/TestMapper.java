package com.example.springbootmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.springbootmybatis.pojo.User1;



@Mapper public interface TestMapper {
  public void add(User1 test);

  public List<User1> listTest();
}
