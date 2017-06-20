package com.example.kriscool.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayAct extends AppCompatActivity {

    String score;
    String Action;
    String[] number = {"",""};
    int flagdot = 0;
    int flag = 0;
    double wynik;
    int flagminus = 0;
    boolean flagWynik = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final TextView result = (TextView) findViewById(R.id.show);
        result.setText("");

        final Button one = (Button) findViewById(R.id.one);
        final Button two = (Button) findViewById(R.id.two);
        final Button three = (Button) findViewById(R.id.three);
        final Button four = (Button) findViewById(R.id.four);
        final Button five = (Button) findViewById(R.id.five);
        final Button six = (Button) findViewById(R.id.six);
        final Button seven = (Button) findViewById(R.id.seven);
        final Button eight = (Button) findViewById(R.id.eight);
        final Button nine = (Button) findViewById(R.id.nine);
        final Button eq = (Button) findViewById(R.id.equal);
        final Button add = (Button) findViewById(R.id.add);
        final Button sub = (Button) findViewById(R.id.sub);
        final Button divide = (Button) findViewById(R.id.div);
        final Button multiply = (Button) findViewById(R.id.mul);
        final Button C = (Button) findViewById(R.id.C);
        final Button bskp = (Button) findViewById(R.id.Bksp);
        final Button Dot = (Button) findViewById(R.id.dot);
        final Button zero = (Button) findViewById(R.id.zero);
        final Button change = (Button) findViewById(R.id.Change);




        change.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*System.out.println("Message");
                if(flagminus == 0){
                    System.out.println("Message2");
                    number[flag] = '-' + number[flag];
                    result.setText(number[flag]);
                    flagminus =1;}
                else {
                    System.out.println("Message3");
                    flagminus =0;
                    number[flag] = number[flag].substring(1,number[flag].length());
                    result.setText(number[flag]);
                }*/

                if(number[flag].contains("-")){
                    number[flag]=number[flag].substring(1,number[flag].length());
                    result.setText(number[flag]);
                }else
                    number[flag] = "-"+number[flag];
                result.setText(number[flag]);
            }
        });

        Dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(number[flag].length() != 0) {
                    if (flagdot == 0) {
                        number[flag] += '.';
                        result.setText(number[flag]);
                        flagdot = 1;
                    }
                }else{
                    if (flagdot == 0) {
                        number[flag] += "0.";
                        result.setText(number[flag]);
                        flagdot = 1;
                    }
                }
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[0]="";
                number[1]="";
                result.setText(number[flag]);
                flag = 0;
                flagdot =0;
            }
        });

        bskp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(number[flag].length()!=0){
                    String b = number[flag].substring(number[flag].length()-1);
                    if(b.equals("."))
                    {

                        flagdot = 0;
                        number[flag] = number[flag].substring(0,number[flag].length()-1);
                        result.setText(number[flag]);

                    }else {

                        number[flag] = number[flag].substring(0, number[flag].length() - 1);
                        result.setText(number[flag]);


                    }

            }}

        });

        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '0';
                result.setText(number[flag]);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '1';
                result.setText(number[flag]);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '2';
                result.setText(number[flag]);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '3';
                result.setText(number[flag]);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '4';
                result.setText(number[flag]);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '5';
                result.setText(number[flag]);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '6';
                result.setText(number[flag]);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '7';
                result.setText(number[flag]);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '8';
                result.setText(number[flag]);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number[flag] += '9';
                result.setText(number[flag]);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Action = "add";
                flag = 1;
                flagdot =0;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Action = "sub";
                flag = 1;
                flagdot =0;
                flagminus =0;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Action = "div";
                flag = 1;
                flagdot =0;
                flagminus =0;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Action = "mul";
                flag = 1;
                flagdot =0;
                flagminus =0;
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(number[0].length()!=0 && number[1].length()!=0){
                flagWynik = true;
                double value1 = Double.parseDouble(number[0]);
                double value2 = Double.parseDouble(number[1]);
                if(Action.equals("add")){
                    wynik = value1 + value2;
                }else if(Action.equals("sub")){
                    wynik = value1 - value2;
                }else if(Action.equals("div")){
                    if(value2!=0){
                        wynik = value1/value2;}else{
                        Toast.makeText(getApplicationContext(), "Nie można dzielić przez 0!",
                                Toast.LENGTH_LONG).show();
                        flagWynik = false;}

                }else if(Action.equals("mul")){
                    wynik = value1 * value2;
                }
                if(flagWynik ==true) {
                    score = String.valueOf(wynik);
                    number[1] = "";
                    flagdot = 0;
                    flagminus = 0;
                    flag= 0;
                    if (score.substring(score.length() - 2, score.length()).equals(".0")) {
                        number[0] = String.valueOf(score.substring(0, score.length() - 2));

                        result.setText(number[0]);
                    } else {
                        number[0] = String.valueOf(wynik);
                        result.setText(number[0]);
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Nie podałeś liczb!",
                            Toast.LENGTH_LONG).show();
                }
                }
            }
        });
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        number[0]=savedInstanceState.getString("number1");
        flagdot = savedInstanceState.getInt("dot");
        flag = savedInstanceState.getInt("flag");
        final TextView result = (TextView) findViewById(R.id.show);
        Action =   savedInstanceState.getString("dzialanie");
        result.setText(number[0]);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("number1",number[0]);
        outState.putInt("dot",flagdot);
        outState.putInt("flag",flag);
        outState.putString("dzialanie",Action);
    }

}
