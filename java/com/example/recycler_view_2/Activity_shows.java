package com.example.recycler_view_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Activity_shows extends AppCompatActivity {
    ArrayList<ShowsContactH> arrayList = new ArrayList<>();
    RecyclerView recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_shows);
        recyclerView1=findViewById(R.id.R2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager);

        arrayList.add(new ShowsContactH(R.drawable.shos1,R.drawable.star));
        arrayList.add(new ShowsContactH(R.drawable.sss1,R.drawable.star));
        arrayList.add(new ShowsContactH(R.drawable.sss2,R.drawable.star));
        arrayList.add(new ShowsContactH(R.drawable.sss3,R.drawable.star));
        arrayList.add(new ShowsContactH(R.drawable.sss4,R.drawable.star));


        RecyclerContactAdapterH recyclerContactAdapterH = new RecyclerContactAdapterH(this,arrayList);
        recyclerView1.setAdapter(recyclerContactAdapterH);
    }
}