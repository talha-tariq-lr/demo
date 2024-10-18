package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.Score;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
@CrossOrigin()
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

    @PostMapping("/scores")
    @ResponseStatus(HttpStatus.CREATED)
    public Score retreiveScores(@RequestBody Score score) {
        System.out.println(score);

        return new Score("yes checking this", "and this aswell", 55, 66);
    }

}

