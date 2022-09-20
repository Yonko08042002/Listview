package com.google.myapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;

        listView = findViewById(R.id.listviewMonAn);
        arrayList =new ArrayList<>();
        arrayList.add(new MonAn("Cơm Trứng","information of item 1",R.drawable.com));
        arrayList.add(new MonAn("Mì tôm","information of item 2",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 3",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 4",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 5",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 6",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 7",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 8",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 9",R.drawable.mi));
        arrayList.add(new MonAn("Mì tôm","information of item 10",R.drawable.mi));

        adapter =new AdapterMonAn(MainActivity.this,R.layout.layout_item,arrayList);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?>  parent, View view, int position, long id) {
//                if (position==0){
//                    Intent intent =new Intent();
//                    intent.setClass(MainActivity.this,MainActivity2.class);
//                    startActivity(intent);
//                }
//            }
//        });
    }
}