package com.lxd.controller;/*
 *  create by 20224
 *  2020/5/15
 * */

import com.lxd.entity.Menu;
import com.lxd.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientHanlder {
    @Autowired
    private MenuFeign menuFeign;
    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return menuFeign.findAll(index, limit);
    }
}
