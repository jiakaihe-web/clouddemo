package com.kaihe.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "test-server",fallback = HisrtyInfo.class)
public interface FeginService {


    @GetMapping("/list")
    String getList();
}
