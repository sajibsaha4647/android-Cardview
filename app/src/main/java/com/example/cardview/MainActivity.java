package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import CustomAdaptar.Myadapter;
import Customcalss.ShowMyicon;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public ArrayList<ShowMyicon>arrayList;
    public String [] iconTitle;
    public int [] imageResourceId;
    public Myadapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.newRecycleview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        arrayList = new ArrayList<ShowMyicon>();

        myadapter = new Myadapter(this,arrayList);

        recyclerView.setAdapter(myadapter);

        iconTitle = new String[]{
                "School",
                "Hospital",
                "Aroplan",
                "Restaurant",
        };

        imageResourceId = new int[]{
                R.drawable.school,
                R.drawable.hospital,
                R.drawable.aroplan,
                R.drawable.restaurant,
        };


        getData();


    }


    public void getData(){
        for(int i = 0; i<iconTitle.length; i++){
            ShowMyicon showMyicon = new ShowMyicon(iconTitle[i],imageResourceId[i]);
            arrayList.add(showMyicon);
        }

        myadapter.notifyDataSetChanged();
    }



}