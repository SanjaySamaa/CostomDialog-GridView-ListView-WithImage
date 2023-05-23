package com.example.customedilogue_listview_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

//    String fruits [] = {"grape","watermelon","banana","apple","mango"};
//    private TextView tv;

//    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         Button listview_btn, image_listview_btn, gridview_btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview_btn = findViewById(R.id.btnlistview);
        image_listview_btn = findViewById(R.id.btnimagelistview);
        gridview_btn = findViewById(R.id.btngridview);

        listview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListViewDialog listViewDialog = new ListViewDialog(MainActivity.this);
                listViewDialog.setCancelable(false);
                listViewDialog.show();
            }
        });
        image_listview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageListViewDialog imageListViewDialog = new ImageListViewDialog(MainActivity.this);
                imageListViewDialog.setCancelable(false);
                imageListViewDialog.show();
            }
        });
        gridview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GridViewDialog gridViewDialog = new GridViewDialog(MainActivity.this);
                gridViewDialog.setCancelable(false);
                gridViewDialog.show();
            }
        });

    }
}