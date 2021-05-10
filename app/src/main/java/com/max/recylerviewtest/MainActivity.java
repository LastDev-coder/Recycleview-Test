package com.max.recylerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.max.recylerviewtest.Adapter.RecycleviewAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] mydata= {"Android","Kotlin","Flutter","Ionic","Xarmin","c","c++","Java","dart"};
        recyclerView.setAdapter(new RecycleviewAdapter(mydata));
    }
}