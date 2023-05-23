package com.example.customedilogue_listview_gridview;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewDialog extends Dialog {
    private GridViewAdapter gridViewAdapter;
    private GridView gv;
    private TextView tv;
    private Button btn;
    ArrayList<DataClass> imgList = new ArrayList<DataClass>();

    public GridViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_grid_view);
        tv = findViewById(R.id.grid_view_textview);
        gv=findViewById(R.id.grid_view);
        btn = findViewById(R.id.btn_grid_view);

        imgList.add(new DataClass(R.drawable.apple,"apple"));
        imgList.add(new DataClass(R.drawable.apple,"banana"));

        gridViewAdapter = new GridViewAdapter(context,imgList);
        gv.setAdapter(gridViewAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            dismiss();
            }
        });

    }

}