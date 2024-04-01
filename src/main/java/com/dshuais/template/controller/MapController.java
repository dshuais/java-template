package com.dshuais.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dshuais
 * @date 2024/4/1 17:33
 * @description:
 */
@RestController
public class MapController {

    @RequestMapping("/student/users")
    public Map<String, String> getUserAll() {
        Map<String, String> student = new HashMap<>(4);
        student.put("1000", "张三");
        student.put("1001", "李四");
        student.put("1002", "胡八一");
        student.put("1003", "张一山");

        return student;
    }

    @RequestMapping("/student/user")
    public String getUser(Integer sn) {
        Map<Integer, String> student = new HashMap<>(4);
        student.put(1000, "张三");
        student.put(1001, "李四");
        student.put(1002, "胡八一");
        student.put(1003, "张一山");

        String s = student.get(sn);
        if(s == null) {
            return "查无此人！";
        } else {
            return s;
        }
    }

    @RequestMapping("/student/userName")
    public List<Object> getUserName(String name) {
        Map<Integer, String> student = new HashMap<>(4);
        student.put(1000, "张三");
        student.put(1001, "李四");
        student.put(1002, "胡八一");
        student.put(1003, "张一山");

        Object[] array1 = student.keySet().toArray();
        List<Object> list = Arrays.stream(array1).filter(item -> student.get(item).indexOf(name) != -1).collect(Collectors.toList());

        return  list;
    }

}
