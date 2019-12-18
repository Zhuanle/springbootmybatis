package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.pojo.User1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper public interface TestMapper {
  public void add(User1 test);

  public List<User1> listTest();
}
