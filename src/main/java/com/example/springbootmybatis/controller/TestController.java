package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.mapper.TestMapper;
import com.example.springbootmybatis.pojo.User1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */


@Controller public class TestController {

  @Autowired TestMapper testMapper;

  @RequestMapping("/add") public void add() {
    User1 test = new User1();
    test.setId(12);
    test.setName("zw");
    test.setUsername("w");
    test.setPassword("123456");

    testMapper.add(test);

  }

  @RequestMapping("/list")
  public String list(Model m, @RequestParam(value = "start", defaultValue = "0") int start,
      @RequestParam(value = "size", defaultValue = "5") int size) {
    PageHelper.startPage(start, size);
    List<User1> list = testMapper.listTest();
    PageInfo<User1> page = new PageInfo<>(list);
    m.addAttribute("page", page);
    return "user";
  }
}
