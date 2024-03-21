package com.dshuais.template.controller;

import com.dshuais.template.server.ScoreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ds
 * @date: 2024-3-21
 */
@RestController
public class LeetcodeContorller {

    @Autowired
    private ScoreInterface scoreInterface;

    @PostMapping("/sort")
    public double calculateFun(@RequestBody List<Double> list) {

        double newList = scoreInterface.calculate(list);
        return newList;
    }
}
