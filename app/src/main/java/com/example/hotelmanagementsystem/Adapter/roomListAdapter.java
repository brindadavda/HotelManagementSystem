package com.example.hotelmanagementsystem.Adapter;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hotelmanagementsystem.Activity.LoginActivity;
import com.example.hotelmanagementsystem.Activity.RoomDetailsActivity;
import com.example.hotelmanagementsystem.Model.roomDesign;
import com.example.hotelmanagementsystem.R;
import com.example.hotelmanagementsystem.Activity.RoomListActivity;
import com.example.hotelmanagementsystem.fragment.Home;

import java.util.ArrayList;

public class roomListAdapter extends RecyclerView.Adapter<roomListAdapter.MyHolder> {
    private RoomListActivity roomListActivity;
    private ArrayList<roomDesign> room;
    public roomListAdapter(RoomListActivity roomListActivity, ArrayList<roomDesign> room) {
        this.roomListActivity = roomListActivity;
        this.room = room;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(roomListActivity).inflate(R.layout.room_design,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.tvroomName.setText(room.get(position).getText());

        holder.ivnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomListActivity, RoomDetailsActivity.class);
                roomListActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return room.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        ImageView ivRoomImg , ivnext;
        TextView tvroomName;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            ivRoomImg = itemView.findViewById(R.id.ivRoomImg);
            ivnext = itemView.findViewById(R.id.ivnext);
            tvroomName = itemView.findViewById(R.id.tvroomName);
        }
    }
}
