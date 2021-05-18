package my.home.chef_proj.service.impl;

import my.home.chef_proj.dao.MenuDao;
import my.home.chef_proj.entity.Menu;
import my.home.chef_proj.service.MenuService;
import my.home.chef_proj.util.FolderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Value("${menu.dir}")
    private String menuDir;

    @Override
    public Set<Menu> parse() {
        return null;
    }

    @Override
    public Menu save() {
        return null;
    }

    @Override
    public List<Menu> saveAll() {
        Set<String> dirs = FolderUtils.parseFolder(menuDir).stream().map(File::getName).collect(Collectors.toSet());
        List<Menu> menus = new LinkedList<>();
        dirs.stream().forEach(s -> menus.add(new Menu(s)));

        return menuDao.saveAll(menus);
    }
}
