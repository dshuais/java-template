package com.dshuais.template.impl;

import com.dshuais.template.server.ScoreInterface;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dshuais
 * @date 2024/3/21 15:29
 * @description: 评委打分练习接口实现
 */
@Service
public class ScoreImpl implements ScoreInterface {

    @Override
    public double calculate(List<Double> list) {
        double sum = 0;
        List sortList = sort(list);

//        for (int i = 0; i < list.size(); i++) {
//
//        }
        return sum;
    }

    @Override
    public List sort(List<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    double max = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, max);
                }
            }
        }
        return list;
    }
}
