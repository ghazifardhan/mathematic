package com.app.simple.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtLength;
    private EditText edtHeight;
    private EditText edtResult;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        edtLength = (EditText) findViewById(R.id.editTextLength);
        edtHeight = (EditText) findViewById(R.id.editTextHeight);
        btnResult = (Button) findViewById(R.id.btnResult);
        edtResult = (EditText) findViewById(R.id.editTextResult);
    }

    private void calculateArea() {
        int length = Integer.parseInt(edtLength.getText().toString());
        int height = Integer.parseInt(edtHeight.getText().toString());
        int area = length*height;
        edtResult.setText(area+"");
    }
}
