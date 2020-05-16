package com.lxd.controller;/*
 *  create by 20224
 *  2020/5/14
 * */

import com.lxd.entity.Menu;
import com.lxd.entity.MenuVO;
import com.lxd.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Value("${server.port}")
    private String port;
    @Autowired(required = false)
    private MenuRepository menuRepository;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        List<Menu> list= menuRepository.findAll(index,limit);
        MenuVO menuVO = new MenuVO(0,"",menuRepository.count(),list);
        return menuVO;
    }
}
