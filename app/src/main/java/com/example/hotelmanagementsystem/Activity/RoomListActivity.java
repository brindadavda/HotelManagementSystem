package com.example.hotelmanagementsystem.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hotelmanagementsystem.Adapter.roomListAdapter;
import com.example.hotelmanagementsystem.Model.roomDesign;
import com.example.hotelmanagementsystem.R;

import java.util.ArrayList;
import java.util.Collection;

public class RoomListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    com.example.hotelmanagementsystem.Adapter.roomListAdapter roomListAdapter;
    public static ArrayList<com.example.hotelmanagementsystem.Model.roomDesign> room = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        //adding  data to room arraylist
        roomDesign roomDesign_ob = new roomDesign("0","5000","text",Integer.toString(R.drawable.room));
        roomDesign roomDesign_ob2 = new roomDesign("0","5000","text2",Integer.toString(R.drawable.room));
        room.add(roomDesign_ob);
        room.add(roomDesign_ob2);

        roomListAdapter = new roomListAdapter(this,room);
        recyclerView.setAdapter(roomListAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}