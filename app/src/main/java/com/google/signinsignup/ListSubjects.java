package com.google.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListSubjects extends AppCompatActivity {
    ArrayList<ItemSubjects> arrayListSubjects = new ArrayList<>();
    AdapterSubjects adapter;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_subjects);

        ListView listview;



        listview = findViewById(R.id.listview);
        arrayListSubjects.add(new ItemSubjects("1. School", "1.Trường học", R.drawable.truonghoc));
        arrayListSubjects.add(new ItemSubjects("2. Examination", "2.Kì thi", R.drawable.kithi));
        arrayListSubjects.add(new ItemSubjects("3. Extracurricular Activities", "3.Hoạt động ngoại khoá", R.drawable.hdngoaikhoa));
        arrayListSubjects.add(new ItemSubjects("4. School Stationery", "4.Dụng cụ học tập", R.drawable.dungcuht));
        arrayListSubjects.add(new ItemSubjects("5. School Subject", "5.Các môn học", R.drawable.monhoc));
        arrayListSubjects.add(new ItemSubjects("6. Classroom", "6.Classroom", R.drawable.lophoc));
        arrayListSubjects.add(new ItemSubjects("7. Universities ", "7.Trường đại học", R.drawable.truonghoc));
        arrayListSubjects.add(new ItemSubjects("8. Body ", "Bộ phận cơ thể", R.drawable.bophancothe));
        arrayListSubjects.add(new ItemSubjects("9. Appearance ", "Ngoại hình", R.drawable.ngoaihinh));

        adapter = new AdapterSubjects(ListSubjects.this, arrayListSubjects);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListSubjects.this,""+i,Toast.LENGTH_SHORT).show();
            }
        });
        img = (ImageView) findViewById(R.id.back_home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
    }
    public void back() {
        Intent intent = new Intent(this, navigation_home.class);
        startActivity(intent);
    }
}