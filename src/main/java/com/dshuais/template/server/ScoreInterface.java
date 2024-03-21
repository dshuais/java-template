package com.dshuais.template.server;

import java.util.List;

/**
 * @author dshuais
 * @date 2024/3/21 15:26
 * @description: 评委打分练习接口
 */
public interface ScoreInterface {

    /**
     * 计算排序
     * @param list
     * @return
     */
    double calculate(List<Double> list);

    /**
     * 排序
     * @param list
     * @return
     */
    List sort(List<Double> list);
}
