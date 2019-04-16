package com.chinaoft.lgh.continue_learing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class IndexController {

    @GetMapping("")
    public String index(){
        return "index";
    }

}
