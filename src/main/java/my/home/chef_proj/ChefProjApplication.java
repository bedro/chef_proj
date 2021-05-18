package my.home.chef_proj;

import my.home.chef_proj.dao.impl.TagDaoImpl;
import my.home.chef_proj.service.MenuService;
import my.home.chef_proj.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ChefProjApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ChefProjApplication.class, args);
//        ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
//        MenuServiceImpl bean = beanFactory.getBean(MenuServiceImpl.class);
//        bean.saveAll();
    }

}
