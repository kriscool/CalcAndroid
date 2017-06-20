package com.example.kriscool.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        final Button basic = (Button) findViewById(R.id.Simple);
        final Button advence = (Button) findViewById(R.id.Advance);
        final Button about = (Button) findViewById(R.id.About);


        basic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, DisplayAct.class);

                MainActivity.this.startActivity(myIntent);

            }
        });
        advence.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, AdvAct.class);

                MainActivity.this.startActivity(myIntent);

            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, About.class);

                MainActivity.this.startActivity(myIntent);

            }
        });

    }
}
