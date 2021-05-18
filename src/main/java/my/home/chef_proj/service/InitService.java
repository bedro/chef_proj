package my.home.chef_proj.service;

import my.home.chef_proj.util.FolderUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class InitService implements InitializingBean {
    @Value("${menu.dir}")
    private String menuDir;

    @Autowired
    MenuService menuService;

    private void parseFolders(){
    }

    @Override
    public void afterPropertiesSet() throws Exception {
menuService.saveAll();
        Set<File> menus = FolderUtils.parseFolder(menuDir);
        List<String> recipes = menus.stream().map(File::listFiles)
                .flatMap(files -> Arrays.stream(files).filter(file -> !file.getName().contains("Новая папка")))
                .map(file -> file.getParentFile().getName() + "/" + file.getName()).collect(Collectors.toList());
//        Files.lines(Path.of(Arrays.stream(new File(menuDir+recipes.get(2)).listFiles()).filter(file -> file.getName().contains(".txt")).findFirst().value.getPath())).collect(Collectors.toList());

    }
}
