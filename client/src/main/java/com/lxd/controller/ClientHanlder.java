package com.lxd.controller;/*
 *  create by 20224
 *  2020/5/15
 * */

import com.lxd.entity.Menu;
import com.lxd.entity.MenuVO;
import com.lxd.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientHanlder {
    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        int index = (page-1)*limit;
        return menuFeign.findAll(index, limit);  //返回一个数据，自动解析视图，需要加responsebody
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }
}
