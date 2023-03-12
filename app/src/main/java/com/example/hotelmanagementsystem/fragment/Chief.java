package com.example.hotelmanagementsystem.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hotelmanagementsystem.Activity.CongratulationActivity;
import com.example.hotelmanagementsystem.R;


public class Chief extends Fragment {

    Button btnSendToManager;

    public Chief() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chief, container, false);

        btnSendToManager = view.findViewById(R.id.btnSendToManager);
        btnSendToManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //send the data to manager.
                startActivity(new Intent(getContext(), CongratulationActivity.class));
            }
        });

        return view;
    }
}