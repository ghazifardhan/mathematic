package com.app.simple.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);

        Button button1=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),MainCircleActivity.class);
                startActivity(i);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),MainTriangleActivity.class);
                startActivity(i);
            }
        });

    }
}
