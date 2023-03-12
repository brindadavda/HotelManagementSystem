package com.example.hotelmanagementsystem.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotelmanagementsystem.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class RoomDetailsActivity extends AppCompatActivity {

    TextView tvRoomName;
    Button btnBookRoom;
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_details);

        init();

        btnBookRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailsBottomSheet();
            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void init(){
        tvRoomName = findViewById(R.id.tvRoomName);
        btnBookRoom = findViewById(R.id.btnBookRoom);
        ivBack = findViewById(R.id.ivBack);
    }

    private void detailsBottomSheet() {
        //bottom sheet
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        //inflate view for bottomsheet
        View view = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_room_booking_layout,null);
        //set view to bottomsheet
        Button btnSubmit = view.findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoomDetailsActivity.this,CongratulationActivity.class));
            }
        });

        bottomSheetDialog.setContentView(view);

        //show dialog
        bottomSheetDialog.show();

    }
}