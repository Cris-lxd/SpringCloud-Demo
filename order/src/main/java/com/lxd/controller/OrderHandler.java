package com.lxd.controller;/*
 *  create by 20224
 *  2020/5/13
 * */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口是"+this.port;
    }
}
