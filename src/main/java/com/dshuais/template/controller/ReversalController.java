package com.dshuais.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dshuais
 * @date 2024/3/27 17:01
 * @description:
 */
@RestController
public class ReversalController {

    /**
     * 反转字符串
     * @param string
     * @return
     */
    @RequestMapping("/reversal")
    public String reversal(String string) {

        String s = new String();
        String[] split = string.split("");

        for (int i = split.length - 1; i >= 0; i--) {
            s += split[i];
        }

        System.out.println(s);
        return s;
    }

    /**
     * 隐藏手机号
     * @param phone
     * @return
     */
    @RequestMapping("/hidePhone")
    public String hide(String phone) {

        if(phone.length() != 11) {
            return "不是正确的手机号";
        }

        String start = phone.substring(0, 3);
        String end = phone.substring(phone.length() - 4, phone.length());

        return start + "****" + end;
    }
}
