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

import java.util.ArrayList;


@RequestMapping("/")
@RestController
@CrossOrigin()
public class DemoController {

    DemoRepository repo;

    public DemoController(DemoRepository repo) {
        this.repo = repo;
    }


    @GetMapping("")
    public String home() {
        return "nbye bye!";
    }

    @GetMapping("/hello")
    public String yes() {
        return "yesyesyesyesyyeysyeysgeuisgdsgiodugoidsfguoifdsugiosdfugoisdfuigo";
    }

    @PostMapping("/score")
    @ResponseStatus(HttpStatus.CREATED)
    public Score saveScore(@RequestBody Score score) {

        repo.save(score);


        return new Score("yes checking this", "and this aswell", 55, 66);
    }

    @GetMapping("/scores")
    public ArrayList<Score> getScores() {
        return repo.getAllScores();
    }

}

