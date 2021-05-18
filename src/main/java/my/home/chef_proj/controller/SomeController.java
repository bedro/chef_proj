package my.home.chef_proj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SomeController {



    @Value("asdasda")
    private String message;


    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);

        return "welcome"; //view
    }

    // /hello?name=kotlin
    @GetMapping("/1")
    public String mainWithParam1() {

        return String.valueOf(1); //view
    }



}