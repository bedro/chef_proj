package my.home.chef_proj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    @Autowired
    MenuService menuService;

//    @Autowired
//    RecipeService recipeService;
//
//    @Autowired
//    TagService tagService;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 10333300)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));


    }
}
