package my.home.chef_proj.dao;

import my.home.chef_proj.entity.Menu;

import java.util.List;

public interface MenuDao {

    List<Menu> findAll();
    List<Menu> save(Menu menu);
    List<Menu> saveAll(List<Menu> menus);
    Menu findById(Long id);
    List<Menu> findByName(String name);
}
