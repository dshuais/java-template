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

        sortList.set(0, 0.0);
        sortList.set(sortList.size() - 1, 0.0);

        for (int i = 0; i < sortList.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    @Override
    public List sort(List<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if(list.get(j-1) > list.get(j)) {
                    double max = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, max);
                }
            }
        }
        return list;
    }
}
