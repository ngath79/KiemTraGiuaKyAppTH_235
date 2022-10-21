package com.google.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView img;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });

        button = (Button) findViewById(R.id.lognout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back_Out();
            }
        });
    }
    public void back() {
        Intent intent = new Intent(this, navigation_home.class);
        startActivity(intent);
    }

    public void back_Out() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}