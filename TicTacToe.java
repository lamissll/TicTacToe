package com.example.romitnagda.tictactoe;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TicTacToe extends ActionBarActivity {

    public final static String playerName = "John";
    int turn = 0;
    int c[] = new int[10];
    int i, j, k = 0;
    TextView textView;
    int one, two, three, four, five, six, seven, eight, nine = 0;
    TextView player1 = (TextView);
    TextView player2;

    boolean gameOver = false;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_to);
        textView = (TextView) findViewById(R.id.dialogue);
        player1 = (TextView) findViewById(R.id.player1name);
        player2 = (TextView) findViewById(R.id.player2name);

        createBoard(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opt_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.new_game:
                createBoard(true);
                return true;
            case R.id.leaderboard:
                leaderBoard();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void leaderBoard() {
        Intent intent = new Intent(this, TicTacToe.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra("playerName", playerName);
        startActivity(intent);
    }

    // Set up the game board.
    public void createBoard(boolean clear) {
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        six = 0;
        seven = 0;
        eight = 0;
        nine = 0;
        turn = 0;

        final Button b1 = (Button) findViewById(R.id.one);
        final Button b2 = (Button) findViewById(R.id.two);
        final Button b3 = (Button) findViewById(R.id.three);


        final Button b4 = (Button) findViewById(R.id.four);
        final Button b5 = (Button) findViewById(R.id.five);
        final Button b6 = (Button) findViewById(R.id.six);


        final Button b7 = (Button) findViewById(R.id.seven);
        final Button b8 = (Button) findViewById(R.id.eight);
        final Button b9 = (Button) findViewById(R.id.nine);

        for (i = 1; i <= 9; i++) {
            c[i] = 2;
        }

        textView.setText("Tic Tac Toe");

        if (clear) {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        if (gameOver) {
            finish();
        }
        // add the click listeners for each button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one < 1) {
                    if (turn % 2 == 0) {
                        b1.setText("X");
                        c[1] = 0;
                    } else {
                        b1.setText("O");
                        c[1] = 1;
                    }
                    turn++;
                    one++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (two < 1) {
                    if (turn % 2 == 0) {
                        b2.setText("X");
                        c[2] = 0;
                    } else {
                        b2.setText("O");
                        c[2] = 1;
                    }
                    turn++;
                    two++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (three < 1) {
                    if (turn % 2 == 0) {
                        b3.setText("X");
                        c[3] = 0;
                    } else {
                        b3.setText("O");
                        c[3] = 1;
                    }
                    turn++;
                    three++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (four < 1) {
                    if (turn % 2 == 0) {
                        b4.setText("X");
                        c[4] = 0;
                    } else {
                        b4.setText("O");
                        c[4] = 1;
                    }
                    turn++;
                    four++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five < 1) {
                    if (turn % 2 == 0) {
                        b5.setText("X");
                        c[5] = 0;
                    } else {
                        b5.setText("O");
                        c[5] = 1;
                    }
                    turn++;
                    five++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (six < 1) {
                    if (turn % 2 == 0) {
                        b6.setText("X");
                        c[6] = 0;
                    } else {
                        b6.setText("O");
                        c[6] = 1;
                    }
                    turn++;
                    six++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seven < 1) {
                    if (turn % 2 == 0) {
                        b7.setText("X");
                        c[7] = 0;
                    } else {
                        b7.setText("O");
                        c[7] = 1;
                    }
                    turn++;
                    seven++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eight < 1) {
                    if (turn % 2 == 0) {
                        b8.setText("X");
                        c[8] = 0;
                    } else {
                        b8.setText("O");
                        c[8] = 1;
                    }
                    turn++;
                    eight++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nine < 1) {
                    if (turn % 2 == 0) {
                        b9.setText("X");
                        c[9] = 0;
                    } else {
                        b9.setText("O");
                        c[9] = 1;
                    }
                    turn++;
                    nine++;
                    gameOver = checkBoard();
                } else {
                }
            }
        });
    }

    // check the board to see if someone has won
    private boolean checkBoard() {
        if ((c[1] == 0 && c[2] == 0 && c[3] == 0)
                || (c[4] == 0 && c[5] == 0 && c[6] == 0)
                || (c[7] == 0 && c[8] == 0 && c[9] == 0)
                || (c[1] == 0 && c[4] == 0 && c[7] == 0)
                || (c[2] == 0 && c[5] == 0 && c[8] == 0)
                || (c[3] == 0 && c[6] == 0 && c[9] == 0)
                || (c[1] == 0 && c[5] == 0 && c[9] == 0)
                || (c[3] == 0 && c[5] == 0 && c[7] == 0)) {
            textView.setText("Game over. Player1 wins!");
            gameOver = true;
        } else if ((c[1] == 1 && c[2] == 1 && c[3] == 1)
                || (c[4] == 1 && c[5] == 1 && c[6] == 1)
                || (c[7] == 1 && c[8] == 1 && c[9] == 1)
                || (c[1] == 1 && c[4] == 1 && c[7] == 1)
                || (c[2] == 1 && c[5] == 1 && c[8] == 1)
                || (c[3] == 1 && c[6] == 1 && c[9] == 1)
                || (c[1] == 1 && c[5] == 1 && c[9] == 1)
                || (c[3] == 1 && c[5] == 1 && c[7] == 1)) {
            textView.setText("Game over. Player2 wins!");
            gameOver = true;
        } else {
            if (turn == 9) {
                gameOver = true;
                textView.setText("Game over. It's a draw!");
            } else {
                gameOver = false;
            }
        }
        return gameOver;
    }
}
