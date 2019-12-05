package com.kaihe.test.controller;

import com.kaihe.test.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    FeginService feginService;

    @RequestMapping("/list")
    public String getList(){

        return feginService.getList();
}

}
