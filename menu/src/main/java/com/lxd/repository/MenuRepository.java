package com.lxd.repository;/*
 *  create by 20224
 *  2020/5/14
 * */

import com.lxd.entity.Menu;

import java.util.List;

public interface MenuRepository {

    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findById(Long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(Long id);

}
