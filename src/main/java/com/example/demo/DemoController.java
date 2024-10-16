package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class DemoController {

    public DemoController() {
        
    }


    @GetMapping("")
    public String home() {
        return "nbye bye!";
    }

    @GetMapping("/hello")
    public String yes() {
        return "yesyesyesyesyyeysyeysgeuisgdsgiodugoidsfguoifdsugiosdfugoisdfuigo";
    }

}

