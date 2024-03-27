package com.dshuais.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dshuais
 * @date 2024/3/27 17:01
 * @description:
 */
@RestController
public class ReversalContorller {

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
}
