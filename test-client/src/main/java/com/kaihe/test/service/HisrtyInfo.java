package com.kaihe.test.service;

import org.springframework.stereotype.Component;

@Component
public class HisrtyInfo implements  FeginService{

    @Override
    public String getList() {
        return "访问异常";
    }
}
