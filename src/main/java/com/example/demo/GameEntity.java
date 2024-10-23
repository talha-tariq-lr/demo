package com.example.demo;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class GameEntity {

    private String player1Username;
    private String player2Username;

    private int player1Score;
    private int player2Score;


    public GameEntity(String player1Username, String player2Username,
    int player1Score, int player2Score) {

        this.player1Username = player1Username;
        this.player2Username = player2Username;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

}
