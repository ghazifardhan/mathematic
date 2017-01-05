package com.app.simple.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainCircleActivity extends AppCompatActivity {

    private EditText edtRadius;
    private EditText edtResultCircle;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_circle);
        initUI();
        initEvent();
    }

    private void initEvent() {
        btnResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calculateArea();
            }
        });
    }

    private void initUI() {
        edtRadius = (EditText) findViewById(R.id.editTextRadius);
        edtResultCircle = (EditText) findViewById(R.id.editTextResultCircle);
        btnResult = (Button) findViewById(R.id.btnResultCircle);
    }

    private void calculateArea(){
        double radius = Double.parseDouble(edtRadius.getText().toString());
        double area  = (3.14*radius*radius);
        edtResultCircle.setText(area+"");
    }


}
