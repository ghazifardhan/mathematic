package com.app.simple.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainTriangleActivity extends AppCompatActivity {


    private EditText edtBase;
    private EditText edtHeight;
    private Button btnResult;
    private EditText edtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_triangle);
        initUI();
        initEvent();
    }

    private void initUI(){
        edtBase = (EditText) findViewById(R.id.editTextBase);
        edtHeight = (EditText) findViewById(R.id.editTextHeight);
        btnResult = (Button) findViewById(R.id.btnResultTriangle);
        edtResult = (EditText) findViewById(R.id.editTextResult);
    }

    private void initEvent() {
        btnResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calculateAreaTriangle();
            }
        });
    }

    private void calculateAreaTriangle() {
        int base = Integer.parseInt(edtBase.getText().toString());
        int height = Integer.parseInt(edtHeight.getText().toString());
        int area = ((base*height)/2);
        edtResult.setText(area+"");
    }
}
