package com.example.romitnagda.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Start extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Intent intent = getIntent();
        String message = intent.getStringExtra(TicTacToe.playerName);
        TextView player1 = new TextView(this);
        player1.setTextSize(40);
        player1.setText(message);
    }
}
