package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    increment score of team A by 3 points and display
    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    //    increment score of team A by 2 points and display
    public void addTwoForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    //    increment score of team A by 1 point and display
    public void addOneForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
//    display the text
    private void displayForTeamA(int number){
        TextView totalScore = (TextView) findViewById(R.id.team_a_score);
//        totalScore.setText(""+number);
        totalScore.setText(String.valueOf(number));
    }

//    team B
    //    increment score of team b by 3 points and display
    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    //    increment score of team A by 2 points and display
    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    //    increment score of team A by 1 point and display
    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    //    display the text
    private void displayForTeamB(int number){
        TextView totalScore = (TextView) findViewById(R.id.team_b_score);
//        totalScore.setText(""+number);
        totalScore.setText(String.valueOf(number));
    }
//    reset the score
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}