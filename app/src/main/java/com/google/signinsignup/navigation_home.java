package com.google.signinsignup;

import static com.google.signinsignup.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class navigation_home extends AppCompatActivity {
    private Button btnFrofile, btnHocngay;
    ArrayList<ItemSubjects> arrayListSubjects = new ArrayList<>();
    AdapterSubjects adapter;
    private ImageView img;
    ListView listview;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    private Button btnToggleDark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_navigation_home);




        listview = findViewById(R.id.listview1);
        arrayListSubjects.add(new ItemSubjects("1. School", "1.Trường học", R.drawable.truonghoc));
        arrayListSubjects.add(new ItemSubjects("2. Examination", "2.Kì thi", R.drawable.kithi));
        arrayListSubjects.add(new ItemSubjects("3. Extracurricular Activities", "3.Hoạt động ngoại khoá", R.drawable.hdngoaikhoa));
        arrayListSubjects.add(new ItemSubjects("4. School Stationery", "4.Dụng cụ học tập", R.drawable.dungcuht));
        arrayListSubjects.add(new ItemSubjects("5. School Subject", "5.Các môn học", R.drawable.monhoc));
        arrayListSubjects.add(new ItemSubjects("6. Classroom", "6.Classroom", R.drawable.lophoc));
        arrayListSubjects.add(new ItemSubjects("7. Universities ", "7.Trường đại học", R.drawable.truonghoc));
        arrayListSubjects.add(new ItemSubjects("8. Body ", "Bộ phận cơ thể", R.drawable.bophancothe));
        arrayListSubjects.add(new ItemSubjects("9. Appearance ", "Ngoại hình", R.drawable.ngoaihinh));

        adapter = new AdapterSubjects(navigation_home.this, arrayListSubjects);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(navigation_home.this, Detail.class);
                    startActivity(intent);
            }
        });


        final DrawerLayout drawerLayout = findViewById(R.id.drawlayout);

        ImageView imageViewmenu = findViewById(R.id.imageMenu);

        imageViewmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });



        navigationView = (NavigationView) findViewById(id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.menuProfile:

                        Intent intent = new Intent(navigation_home.this, ProfileActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuNotification:
                        Intent intent1 = new Intent(navigation_home.this , home.class);

                        startActivity(intent1);
                        break;
                    case  R.id.nav_share:{

                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String shareBody =  "http://play.google.com/store/apps/detail?id=" + getPackageName();
                        String shareSub = "Try now";
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));

                    }
                    break;
                }
                return false;
            }
        });
    }



}