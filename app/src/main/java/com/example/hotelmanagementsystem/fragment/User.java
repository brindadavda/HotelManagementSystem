package com.example.hotelmanagementsystem.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hotelmanagementsystem.R;
import com.example.hotelmanagementsystem.Activity.RoomListActivity;

public class User extends Fragment {

    public User() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        ImageView ivRoomBooking = view.findViewById(R.id.ivRoomBooking);

        ivRoomBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),RoomListActivity.class));
            }
        });

        return view;

    }
}