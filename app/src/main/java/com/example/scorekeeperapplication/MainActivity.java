package com.example.scorekeeperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int newYorkScore = 0;
    private int chicagoScore = 0;
    public TextView scoreViewNewYork, scoreViewChicago;
    public Button sixForNewYork, threeForNewYork, twoSafetyForNewYork, oneForNewYork, towForNewYork, sixForChicago, threeForChicago,
            TwoSafetyForChicago, OneForChicago, TwoForChicago,ResetAllScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * creating the views
         */
        //text views
        scoreViewNewYork = findViewById(R.id.team_NewYork_score);
        scoreViewChicago = findViewById(R.id.team_Chicago_score);

        //button views
        sixForNewYork = (Button) findViewById(R.id.sixForNewYork);
        threeForNewYork = findViewById(R.id.threeForNewYork);
        twoSafetyForNewYork = findViewById(R.id.twoSafetyForNewYork);
        oneForNewYork = findViewById(R.id.oneForNewYork);
        towForNewYork = findViewById(R.id.towForNewYork);
        sixForChicago = findViewById(R.id.sixForChicago);
        threeForChicago = findViewById(R.id.threeForChicago);
        TwoSafetyForChicago = findViewById(R.id.TwoSafetyForChicago);
        OneForChicago = findViewById(R.id.OneForChicago);
        TwoForChicago = findViewById(R.id.TwoForChicago);
        ResetAllScores = findViewById(R.id.ResetAllScores);


        //calling function
        setOnClick();

    }

    //giving the button onclick functionality.
    private void setOnClick() {
        sixForNewYork.setOnClickListener(this);
        threeForNewYork.setOnClickListener(this);
        twoSafetyForNewYork.setOnClickListener(this);
        oneForNewYork.setOnClickListener(this);
        towForNewYork.setOnClickListener(this);
        sixForChicago.setOnClickListener(this);
        threeForChicago.setOnClickListener(this);
        TwoForChicago.setOnClickListener(this);
        TwoSafetyForChicago.setOnClickListener(this);
        OneForChicago.setOnClickListener(this);
        ResetAllScores.setOnClickListener(this);

    }

    /**
     * The code below will change the score of New York team.
     */

    public void SixForNewYork() {
        newYorkScore = newYorkScore + 6 ;
        displayNewYorkScore(newYorkScore);

    }

    public void ThreeForNewYork() {
        newYorkScore = newYorkScore + 3 ;
        displayNewYorkScore(newYorkScore);

    }

    public void TwoSafetyForNewYork() {
        newYorkScore = newYorkScore + 2 ;
        displayNewYorkScore(newYorkScore);

    }

    public void OneForNewYork() {
        newYorkScore = newYorkScore + 1 ;
        displayNewYorkScore(newYorkScore);

    }

    public void TowForNewYork() {
        newYorkScore = newYorkScore + 2 ;
        displayNewYorkScore(newYorkScore);

    }


    /**
     * The code below will change the score of chicago team.
     */


    public void SixForChicago() {
        chicagoScore = chicagoScore + 6;
        displayChicagoScore(chicagoScore);


    }

    public void ThreeForChicago() {
        chicagoScore = chicagoScore + 3;
        displayChicagoScore(chicagoScore);


    }

    public void TwoSafetyForChicago() {
        chicagoScore = chicagoScore + 2;
        displayChicagoScore(chicagoScore);


    }

    public void OneForChicago() {
        chicagoScore = chicagoScore + 1;
        displayChicagoScore(chicagoScore);

    }

    public void TwoForChicago() {
        chicagoScore = chicagoScore + 2;
        displayChicagoScore(chicagoScore);

    }

    //display the text on New York scorecard

    private void displayNewYorkScore(int score) {

        scoreViewNewYork.setText(String.valueOf(score));

    }

    //display the text on Chicago scorecard

    private void displayChicagoScore(int score) {

        scoreViewChicago.setText(String.valueOf(score));

    }

    //Reset all the scores

    public void ResetAllScores() {
        newYorkScore = 0;
        chicagoScore = 0;
        displayChicagoScore(chicagoScore);
        displayNewYorkScore(newYorkScore);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.sixForNewYork:
                SixForNewYork();
                break;

            case R.id.threeForNewYork:
                ThreeForNewYork();
                break;

            case R.id.twoSafetyForNewYork:
                TwoSafetyForNewYork();
                break;

            case R.id.oneForNewYork:
                OneForNewYork();
                break;

            case R.id.towForNewYork:
                TowForNewYork();
                break;

            case R.id.sixForChicago:
                SixForChicago();
                break;

            case R.id.threeForChicago:
                ThreeForChicago();
                break;

            case R.id.TwoSafetyForChicago:
                TwoSafetyForChicago();
                break;

            case R.id.OneForChicago:
                OneForChicago();
                break;

            case R.id.TwoForChicago:
                TwoForChicago();
                break;

            case R.id.ResetAllScores:
                ResetAllScores();

            default:
                break;


        }
    }
}
