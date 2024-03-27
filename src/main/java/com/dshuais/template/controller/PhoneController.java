package com.dshuais.template.controller;

import com.dshuais.template.dataobject.PhoneDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dshuais
 * @date 2024/3/27 15:58
 * @description:
 */
@RestController
public class PhoneController {
    @RequestMapping("/getPhone")
    public List<PhoneDO> get(Integer number) {
        ArrayList<PhoneDO> phoneS = new ArrayList<PhoneDO>();
        // 存入三个手机对象，分别为：小米，1000  苹果 6000 华为3999
        PhoneDO iphone = new PhoneDO("苹果", 6000);
        phoneS.add(iphone);
        PhoneDO mi = new PhoneDO("小米", 1000);
        phoneS.add(mi);
        PhoneDO huawei = new PhoneDO("华为", 3999);
        phoneS.add(huawei);

        // 查询价格小于number的手机信息
        List<PhoneDO> filterPhone = phoneS.stream().filter(phone -> phone.getMoney() < number).collect(Collectors.toList());

        return filterPhone;
    }
}
