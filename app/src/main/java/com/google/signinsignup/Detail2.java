package com.google.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Detail2 extends AppCompatActivity {
    private ImageView back_list, back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        back_list = (ImageView) findViewById(R.id.back_home);
        back_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profilr();
            }
        });

        back_home = (ImageView) findViewById(R.id.homeme);
        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hocngay();
            }
        });

    }

    public void profilr() {
        Intent intent = new Intent(this, navigation_home.class);
        startActivity(intent);
    }

    public void hocngay() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}