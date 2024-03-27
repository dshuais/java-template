package com.dshuais.template.dataobject;

import lombok.Data;

/**
 * @author dshuais
 * @date 2024/3/27 16:17
 * @description:
 */

@Data
public class PhoneDO {

    private String brand;

    private Integer number;

    public PhoneDO(String b, Integer n) {
        brand = b;
        number = n;
    }

}
