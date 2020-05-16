package com.lxd.entity;/*
 *  create by 20224
 *  2020/5/16
 * */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {

    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
    //layui需要返回这四个属性的封装数据
}
