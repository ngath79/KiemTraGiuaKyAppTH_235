package com.google.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class home extends AppCompatActivity {
    private Button  btnHocngay;
    private ImageView imgList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgList = (ImageView) findViewById(R.id.arrow_back);
        imgList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Back();
            }
        });

        btnHocngay = (Button) findViewById(R.id.hocngay);
        btnHocngay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hocngay();
            }
        });
    }

    public void hocngay() {
        Intent intent = new Intent(this, ListSubjects.class);
        startActivity(intent);
    }

    public void Back() {
        Intent intent = new Intent(this, navigation_home.class);
        startActivity(intent);
    }

}