package com.example.recycler_view_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact_Row> arrayList= new ArrayList<>();

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.Re_v);
       // RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),2);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,2);
        recycler.setLayoutManager(gridLayoutManager);

        arrayList.add(new Contact_Row(R.drawable.s2,"Price 9$\n"+"Shoes for man & woman\n"+"Bahawalpur"));

        arrayList.add(new Contact_Row(R.drawable.watch,"Price 6$\n"+"Watch for man & woman\n"+"Bahawalpur"));

        arrayList.add(new Contact_Row(R.drawable.bg,"Price 5$\n"+"Bag for man & woman\n"+"Bahawalpur"));

        arrayList.add(new Contact_Row(R.drawable.capp,"Price 2$\n"+"Cap for man & woman\n"+"Bahawalpur"));

        arrayList.add(new Contact_Row(R.drawable.pr,"Price 4$\n"+"Perfume for man & woman\n"+"Bahawalpur"));

        arrayList.add(new Contact_Row(R.drawable.ring,"Price 10$\n"+"Ring for man & woman\n"+"Bahawalpur"));

        RecyclerContactAdapter recyclerContactAdapter=new RecyclerContactAdapter(this,arrayList);
        recycler.setAdapter(recyclerContactAdapter);

    }
}