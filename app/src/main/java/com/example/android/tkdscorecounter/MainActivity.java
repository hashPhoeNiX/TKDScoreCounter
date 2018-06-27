package com.example.android.tkdscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double scoreBlue = 0;
    double scoreRed = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param score for the blue team
     */
    public void blueScore(double score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points for Head Kick Blue
     */
    public void add3pointsForBlue(View v) {
        scoreBlue = scoreBlue + 3;
        blueScore(scoreBlue);
    }

    /**
     * Add 2 points for Head Kick Blue
     */
    public void add2pointsForBlue(View v) {
        scoreBlue = scoreBlue + 2;
        blueScore(scoreBlue);
    }

    /**
     * Add 5 points for Spinning Head Kick Blue
     */
    public void add5PointForBlue(View v) {
        scoreBlue = scoreBlue + 5;
        blueScore(scoreBlue);
    }

    /**
     * Add 4 points for Spinning Head Kick Blue
     */
    public void add4PointForBlue(View v) {
        scoreBlue = scoreBlue + 4;
        blueScore(scoreBlue);
    }

    /**
     * Remove 0.5 from points for kyongo penalty
     */
    public void kyongo_blue(View v) {
        scoreBlue = scoreBlue - 0.5;
        blueScore(scoreBlue);
    }

    /**
     * Remove 0.5 from points for kyongo penalty
     */
    public void gamjeom_blue(View v) {
        scoreBlue = scoreBlue - 1;
        blueScore(scoreBlue);
    }

    /**
     *
     * @param score for red
     */
    public void redScore(double score) {
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points for Head Kick Red
     */
    public void add3pointsForRed(View v) {
        scoreRed = scoreRed + 3;
        redScore(scoreRed);
    }

    /**
     * Add 2 points for Head Kick Red
     */
    public void add2pointsForRed(View v) {
        scoreRed = scoreRed + 2;
        redScore(scoreRed);
    }

    /**
     * Add 5 points for Spinning Head Kick Red
     */
    public void add5PointForRed(View v) {
        scoreRed = scoreRed + 5;
        redScore(scoreRed);
    }

    /**
     * Add 4 points for Spinning Head Kick Red
     */
    public void add4PointForRed(View v) {
        scoreRed = scoreRed + 4;
        redScore(scoreRed);
    }

    /**
     * Remove 0.5 from points for kyongo penalty
     */
    public void kyongo_red(View v) {
        scoreRed = scoreRed - 0.5;
        redScore(scoreRed);
    }

    /**
     * Remove 1 from points for gamjeom penalty
     */
    public void gamjeom_red(View v) {
        scoreRed = scoreRed - 1;
        redScore(scoreRed);
    }

    /**
     * Resets scores to 0
     *
     */
    public void resetScore(View v) {
        scoreRed = 0;
        scoreBlue = 0;
        blueScore(scoreBlue);
        redScore(scoreRed);
    }

}
