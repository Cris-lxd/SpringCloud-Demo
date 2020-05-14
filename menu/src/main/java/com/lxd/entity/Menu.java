package com.lxd.entity;/*
 *  create by 20224
 *  2020/5/14
 * */

import lombok.Data;

@Data   //包含get，set，tostring方法
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
}
