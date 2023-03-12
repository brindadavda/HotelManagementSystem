package com.example.hotelmanagementsystem.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotelmanagementsystem.R;

public class Bill_Generate_Activity extends AppCompatActivity {

    TextView tvOrderId,tvDate,tvRoomRate,tvFoodRate,tvAmount,tvGst,tvTotalAmount;
    ImageView imgBack;
    Button btnBillGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_generate);

        //initialization of all view
        initView();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnBillGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bill_Generate_Activity.this,CongratulationActivity.class));
            }
        });
    }

    private void initView() {

        tvOrderId = findViewById(R.id.tvOrderId);
        tvDate = findViewById(R.id.tvDate);
        tvRoomRate = findViewById(R.id.tvRoomRate);
        tvFoodRate = findViewById(R.id.tvFoodRate);
        tvAmount = findViewById(R.id.tvAmount);
        tvGst = findViewById(R.id.tvGst);
        tvTotalAmount = findViewById(R.id.tvTotalAmount);
        imgBack = findViewById(R.id.imgBack);
        btnBillGenerate = findViewById(R.id.btnBillGenerate);
    }
}