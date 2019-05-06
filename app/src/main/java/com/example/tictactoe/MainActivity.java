package com.example.tictactoe;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;
    Switch aSwitch;

    Random random;

    TextView textView;
    Button button00, button01, button02, button10, button11, button12, button20, button21, button22, resetButton;

    int count = 0;
    int[][] winArray = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    int win = 0;
    String selection = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button00 = findViewById(R.id.button_00);
        button01 = findViewById(R.id.button_01);
        button02 = findViewById(R.id.button_02);
        button10 = findViewById(R.id.button_10);
        button11 = findViewById(R.id.button_11);
        button12 = findViewById(R.id.button_12);
        button20 = findViewById(R.id.button_20);
        button21 = findViewById(R.id.button_21);
        button22 = findViewById(R.id.button_22);
        resetButton = findViewById(R.id.reset);
        dialog = new Dialog(this);
        textView = findViewById(R.id.user);
        random = new Random();

        showPopUp();

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[0][0] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button00.setBackgroundResource(R.drawable.pico);
                        winArray[0][0] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button00.setBackgroundResource(R.drawable.picx);
                        winArray[0][0] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[0][1] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button01.setBackgroundResource(R.drawable.pico);
                        winArray[0][1] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button01.setBackgroundResource(R.drawable.picx);
                        winArray[0][1] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[0][2] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button02.setBackgroundResource(R.drawable.pico);
                        winArray[0][2] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button02.setBackgroundResource(R.drawable.picx);
                        winArray[0][2] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[1][0] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button10.setBackgroundResource(R.drawable.pico);
                        winArray[1][0] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button10.setBackgroundResource(R.drawable.picx);
                        winArray[1][0] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[1][1] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button11.setBackgroundResource(R.drawable.pico);
                        winArray[1][1] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button11.setBackgroundResource(R.drawable.picx);
                        winArray[1][1] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[1][2] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button12.setBackgroundResource(R.drawable.pico);
                        winArray[1][2] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button12.setBackgroundResource(R.drawable.picx);
                        winArray[1][2] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[2][0] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button20.setBackgroundResource(R.drawable.pico);
                        winArray[2][0] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button20.setBackgroundResource(R.drawable.picx);
                        winArray[2][0] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[2][1] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button21.setBackgroundResource(R.drawable.pico);
                        winArray[2][1] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button21.setBackgroundResource(R.drawable.picx);
                        winArray[2][1] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(winArray[2][2] == -1 && textView.getText().toString().equals("Turn : User") && count < 9 && win == 0)
                {
                    if (selection.equals("O"))
                    {
                        button22.setBackgroundResource(R.drawable.pico);
                        winArray[2][2] = 0;
                    }
                    else if (selection.equals("X"))
                    {
                        button22.setBackgroundResource(R.drawable.picx);
                        winArray[2][2] = 1;
                    }
                    textView.setText("Turn : System");
                    count += 1;
                    if (count >= 5)
                    {
                        checkWin();
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            systemTurn();
                        }
                    }, 500);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Select Valid Position",Toast.LENGTH_SHORT).show();
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                button00.setBackgroundResource(R.drawable.blank);
                button01.setBackgroundResource(R.drawable.blank);
                button02.setBackgroundResource(R.drawable.blank);
                button10.setBackgroundResource(R.drawable.blank);
                button11.setBackgroundResource(R.drawable.blank);
                button12.setBackgroundResource(R.drawable.blank);
                button20.setBackgroundResource(R.drawable.blank);
                button21.setBackgroundResource(R.drawable.blank);
                button22.setBackgroundResource(R.drawable.blank);

                button00.setEnabled(true);
                button01.setEnabled(true);
                button02.setEnabled(true);
                button10.setEnabled(true);
                button11.setEnabled(true);
                button12.setEnabled(true);
                button20.setEnabled(true);
                button21.setEnabled(true);
                button22.setEnabled(true);

                for(int i=0; i<winArray.length;i++)
                {
                    for(int j=0;j<winArray[i].length;j++)
                    {
                        winArray[i][j] = -1;
                    }
                }

                textView.setText("Win : None");
                count = 0;
                win = 0;
                selection = "";
                showPopUp();
            }
        });
    }

    public void showPopUp()
    {
        Button imageButton,imageButton1;

        dialog.setContentView(R.layout.custom_popup);
        dialog.setCanceledOnTouchOutside(false);
        imageButton = dialog.findViewById(R.id.selectO);
        imageButton1 = dialog.findViewById(R.id.selectX);
        aSwitch = dialog.findViewById(R.id.switch1);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selection = "O";
                textView.setText("Turn : User");
                dialog.dismiss();
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selection = "X";
                textView.setText("Turn : User");
                dialog.dismiss();
            }
        });

//        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                Toast.makeText(MainActivity.this,""+isChecked,Toast.LENGTH_SHORT).show();
//                if(isChecked) {
//                    //do stuff when Switch is ON
//                } else {
//                    //do stuff when Switch if OFF
//                }
//            }
//        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void checkWin()
    {
        int flag = -1;
        if(selection.equals("O"))
        {
            if ((winArray[0][0] == 0 && winArray[1][1] == 0 && winArray[2][2] == 0)
                    || (winArray[0][2] == 0 && winArray[1][1] == 0 && winArray[2][0] == 0)
                    || (winArray[0][0] == 0 && winArray[1][0] == 0 && winArray[2][0] == 0)
                    || (winArray[0][1] == 0 && winArray[1][1] == 0 && winArray[2][1] == 0)
                    || (winArray[0][2] == 0 && winArray[1][2] == 0 && winArray[2][2] == 0)
                    || (winArray[0][0] == 0 && winArray[0][1] == 0 && winArray[0][2] == 0)
                    || (winArray[1][0] == 0 && winArray[1][1] == 0 && winArray[1][2] == 0)
                    || (winArray[2][0] == 0 && winArray[2][1] == 0 && winArray[2][2] == 0)) {
                win = 1;
                flag = 1;
                textView.setText("Win : User");
            }
            else if ((winArray[0][0] == 1 && winArray[1][1] == 1 && winArray[2][2] == 1)
                    || (winArray[0][2] == 1 && winArray[1][1] == 1 && winArray[2][0] == 1)
                    || (winArray[0][0] == 1 && winArray[1][0] == 1 && winArray[2][0] == 1)
                    || (winArray[0][1] == 1 && winArray[1][1] == 1 && winArray[2][1] == 1)
                    || (winArray[0][2] == 1 && winArray[1][2] == 1 && winArray[2][2] == 1)
                    || (winArray[0][0] == 1 && winArray[0][1] == 1 && winArray[0][2] == 1)
                    || (winArray[1][0] == 1 && winArray[1][1] == 1 && winArray[1][2] == 1)
                    || (winArray[2][0] == 1 && winArray[2][1] == 1 && winArray[2][2] == 1))
            {
                win = 1;
                flag = 0;
                textView.setText("Win : System");
            }
            else if(count == 9 && flag == -1)
            {
                win = 1;
                textView.setText("Win : Draw");
            }
        }
        else if(selection.equals("X"))
        {
            if ((winArray[0][0] == 0 && winArray[1][1] == 0 && winArray[2][2] == 0)
                    || (winArray[0][2] == 0 && winArray[1][1] == 0 && winArray[2][0] == 0)
                    || (winArray[0][0] == 0 && winArray[1][0] == 0 && winArray[2][0] == 0)
                    || (winArray[0][1] == 0 && winArray[1][1] == 0 && winArray[2][1] == 0)
                    || (winArray[0][2] == 0 && winArray[1][2] == 0 && winArray[2][2] == 0)
                    || (winArray[0][0] == 0 && winArray[0][1] == 0 && winArray[0][2] == 0)
                    || (winArray[1][0] == 0 && winArray[1][1] == 0 && winArray[1][2] == 0)
                    || (winArray[2][0] == 0 && winArray[2][1] == 0 && winArray[2][2] == 0))
            {
                win = 1;
                flag = 1;
                textView.setText("Win : System");
            }
            else if ((winArray[0][0] == 1 && winArray[1][1] == 1 && winArray[2][2] == 1)
                    || (winArray[0][2] == 1 && winArray[1][1] == 1 && winArray[2][0] == 1)
                    || (winArray[0][0] == 1 && winArray[1][0] == 1 && winArray[2][0] == 1)
                    || (winArray[0][1] == 1 && winArray[1][1] == 1 && winArray[2][1] == 1)
                    || (winArray[0][2] == 1 && winArray[1][2] == 1 && winArray[2][2] == 1)
                    || (winArray[0][0] == 1 && winArray[0][1] == 1 && winArray[0][2] == 1)
                    || (winArray[1][0] == 1 && winArray[1][1] == 1 && winArray[1][2] == 1)
                    || (winArray[2][0] == 1 && winArray[2][1] == 1 && winArray[2][2] == 1))
            {
                win = 1;
                flag = 0;
                textView.setText("Win : User");
            }
            else if(count == 9 && flag == -1)
            {
                win = 1;
                textView.setText("Win : Draw");
            }
        }
    }

    public void systemTurn()
    {
        int n1 = random.nextInt(3);
        int n2 = random.nextInt(3);

        if(textView.getText().toString().equals("Turn : System") && count < 9 && win == 0)
        {
            while (winArray[n1][n2] != -1) {
                n1 = random.nextInt(3);
                n2 = random.nextInt(3);
            }
            if (n1 == 0 && n2 == 0) {
                if (selection.equals("O")) {
                    button00.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button00.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 0 && n2 == 1) {
                if (selection.equals("O")) {
                    button01.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button01.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 0 && n2 == 2) {
                if (selection.equals("O")) {
                    button02.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button02.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 1 && n2 == 0) {
                if (selection.equals("O")) {
                    button10.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button10.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 1 && n2 == 1) {
                if (selection.equals("O")) {
                    button11.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button11.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 1 && n2 == 2) {
                if (selection.equals("O")) {
                    button12.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button12.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 2 && n2 == 0) {
                if (selection.equals("O")) {
                    button20.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button20.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 2 && n2 == 1) {
                if (selection.equals("O")) {
                    button21.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button21.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            } else if (n1 == 2 && n2 == 2) {
                if (selection.equals("O")) {
                    button22.setBackgroundResource(R.drawable.picx);
                    winArray[n1][n2] = 1;
                } else if (selection.equals("X")) {
                    button22.setBackgroundResource(R.drawable.pico);
                    winArray[n1][n2] = 0;
                }
            }
            textView.setText("Turn : User");
            count += 1;
            if (count >= 5) {
                checkWin();
            }
        }
    }

}
