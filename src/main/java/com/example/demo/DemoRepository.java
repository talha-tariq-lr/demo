package com.example.demo;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.example.Score;

import java.time.Instant;


@Repository
public class DemoRepository {

    ArrayList<Score> demoList = new ArrayList<>();

    public DemoRepository() {
    }


    public void save(Score score) {
        demoList.add(score);

        Instant currentTime = Instant.now();

    }

    public ArrayList<Score> getAllScores() {
        return demoList;
    }
    


    
}
