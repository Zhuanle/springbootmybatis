package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.mapper.TestMapper;
import com.example.springbootmybatis.pojo.User1;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController public class TestController {

  @Autowired TestMapper testMapper;

  @RequestMapping("/add") public void add() {
    User1 test = new User1();
    test.setId(10);
    test.setName("zw");
    test.setUsername("w");
    test.setPassword("123456");

    testMapper.add(test);

  }

  @RequestMapping("/list") public List<User1> list() {
    List<User1> list = testMapper.listTest();
    return list;
  }
}
