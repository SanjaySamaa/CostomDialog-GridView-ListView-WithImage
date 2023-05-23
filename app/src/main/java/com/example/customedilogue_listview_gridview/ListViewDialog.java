package com.example.customedilogue_listview_gridview;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewDialog extends Dialog {
    private TextView tv;
    private ListView lv;
    private Button btn;

    String fruits [] ={
     "Apple",
     "Grape",
     "Banana",
     "Water Melon"
    };

    public ListViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_list_view);
        tv = findViewById(R.id.list_view_title);
        lv=findViewById(R.id.list_view);
        btn=findViewById(R.id.btn_list_view);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            dismiss();
            }
        });
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,fruits);
        lv.setAdapter(arrayAdapter);
    }


}