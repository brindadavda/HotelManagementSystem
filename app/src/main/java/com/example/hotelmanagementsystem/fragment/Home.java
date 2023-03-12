package com.example.hotelmanagementsystem.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.hotelmanagementsystem.R;


public class Home extends Fragment {

    public Home() {
        // Required empty public constructor
    }

    LinearLayout llRoom , llAboutUs , llLocation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        llRoom = view.findViewById(R.id.llRoom);
        llAboutUs = view.findViewById(R.id.llAboutUs);
        llLocation = view.findViewById(R.id.llLocation);

        llRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Room List clicked", Toast.LENGTH_SHORT).show();
            }
        });

        llAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "About Us clicked", Toast.LENGTH_SHORT).show();
            }
        });

        llLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Location clicked", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}