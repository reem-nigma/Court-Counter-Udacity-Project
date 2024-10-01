package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /*
     * var to store score for team A and team B
     */
    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
     * team A methods
     */
    /*
     * team-A-score's method
     */
    public void teamAScore() {
        TextView pointsA = findViewById(R.id.teamATextView);
        pointsA.setText("" + scoreA);
    }

    /*
     * increase team A's score by 3 points
     */
    public void button3A(View view) {

        scoreA = scoreA + 3;
        teamAScore();
    }

    /*
     * increase team A's score by 2 points
     */
    public void button2A(View view) {

        scoreA = scoreA + 2;
        teamAScore();
    }

    /*
     * increase team A's score by 1 points
     */
    public void button1A(View view) {

        scoreA = scoreA + 1;
        teamAScore();
    }
    /*
     * team B methods
     */

    /*
     * team-B-score's method
     */

    public void teamBScore() {
        TextView pointsB = findViewById(R.id.teamBTextView);
        pointsB.setText("" + scoreB);
    }
    /*
     * increase team B's score by 3 points
     */

    public void button3B(View view) {
        scoreB = scoreB + 3;
        teamBScore();
    }
    /*
     * increase team B's score by 2 points
     */

    public void button2B(View view) {
        scoreB = scoreB + 2;
        teamBScore();
    }
    /*
     * increase team B's score by 1 points
     */

    public void button1B(View view) {

        scoreB = scoreB + 1;
        teamBScore();
    }

    /*
     * method to reset team A and team B's scores and tells which team is the winner
     */
    public void reset(View view) {
        if (scoreA > scoreB) {
            Toast.makeText(this, "Team A Won", Toast.LENGTH_LONG).show();
        } else if (scoreB > scoreA) {
            Toast.makeText(this, "Team B Won", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show();
        }
        scoreA = 0;
        scoreB = 0;
        teamAScore();
        teamBScore();


    }
}