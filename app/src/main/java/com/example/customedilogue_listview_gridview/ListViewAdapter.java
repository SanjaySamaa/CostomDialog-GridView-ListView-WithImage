package com.example.customedilogue_listview_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<DataClass> {
    View v;

    public ListViewAdapter(@NonNull Context context, ArrayList<DataClass> arrayList) {
        super(context, 0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        v = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        DataClass getDataLocation = getItem(position);
        ImageView iv = v.findViewById(R.id.list_view_list);
        TextView tv = v.findViewById(R.id.list_view_text);
        iv.setImageResource(getDataLocation.image);
        tv.setText(getDataLocation.text);
        return v;
    }
}
