package my.home.chef_proj.service;

import my.home.chef_proj.entity.Menu;

import java.util.List;
import java.util.Set;

public interface MenuService {
    Set<Menu> parse();

    Menu save();

    List<Menu> saveAll();
}
