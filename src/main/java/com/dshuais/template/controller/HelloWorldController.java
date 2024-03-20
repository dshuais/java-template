package com.dshuais.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: ds
 * @date: 2024-3-19
 */
@RestController
public class HelloWorldController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping("/users")
    public List<Map<String, Object>> getUsers() {
        String sql = "select * from t_users";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

}
