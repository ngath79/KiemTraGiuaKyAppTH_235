package com.google.signinsignup;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterSubjects extends BaseAdapter {
    private Activity activity;
    private List<ItemSubjects> araylistSubjects;

    @Override
    public int getCount() {
        return araylistSubjects.size();
    }

    @Override
    public Object getItem(int i) {
        return araylistSubjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public AdapterSubjects(Activity activity, List<ItemSubjects> araylistSubjects) {
        this.activity = activity;
        this.araylistSubjects = araylistSubjects;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        view = layoutInflater.inflate(R.layout.activity_layoutitem, null);


        TextView textV1 = view.findViewById(R.id.tv_name);
        TextView textV2 = view.findViewById(R.id.note);
        ImageView textimg = view.findViewById(R.id.imghinh);

        textV1.setText(araylistSubjects.get(i).getTenmonhoc());
        textV2.setText(araylistSubjects.get(i).getMota());
        textimg.setImageResource(araylistSubjects.get(i).getHinh());

        return view;
    }
}
