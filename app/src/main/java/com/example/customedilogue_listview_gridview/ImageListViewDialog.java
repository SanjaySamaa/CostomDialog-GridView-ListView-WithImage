package com.example.customedilogue_listview_gridview;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ImageListViewDialog extends Dialog {
    private ListViewAdapter listViewAdapter;
    ArrayList<DataClass> imgList = new ArrayList<DataClass>();
    private android.widget.ListView lv;
    //    private TextView tv;
    private Button btn;

    public ImageListViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_image_list_view);
        lv = findViewById(R.id.image_list_view);
        btn = findViewById(R.id.btn_image_list_view);

        imgList.add(new DataClass(R.drawable.apple, "apple"));
        imgList.add(new DataClass(R.drawable.apple, "banana"));
        listViewAdapter = new ListViewAdapter(context, imgList);

//        listAdapter = new ListAdapter(context, imgList);
        lv.setAdapter(listViewAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }

//        lv=setList

        });
    }

}