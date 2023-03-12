package com.example.hotelmanagementsystem.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hotelmanagementsystem.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class OrderDetailsActivity extends AppCompatActivity {

    TextView tvOrderId,tvDate,tvOrderStatus,tvTotalItems,tvAmount,tvGst,tvTotalAmount;
    ImageView imgBack , ivEditStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        //initialization of all view
        initView();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ivEditStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start the dialog box for edit states
                editOrderStatusDialog();
            }
        });
    }

    private void initView() {
        tvOrderId = findViewById(R.id.tvOrderId);
        tvDate = findViewById(R.id.tvDate);
        tvOrderStatus = findViewById(R.id.tvOrderStatus);
        tvTotalItems = findViewById(R.id.tvTotalItems);
        tvAmount = findViewById(R.id.tvAmount);
        tvGst = findViewById(R.id.tvGst);
        tvTotalAmount = findViewById(R.id.tvTotalAmount);
        imgBack = findViewById(R.id.imgBack);
        ivEditStatus = findViewById(R.id.ivEditStatus);
    }

    private void editOrderStatusDialog() {
        //option to display dialog
        String[] options = {"In Process","Completed","Cancelled"};
        //dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Edit Order Status")
                .setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        //handle item clicks
                        String selectedOption = options[i];
                        Toast.makeText(OrderDetailsActivity.this, "Order Status is : "+selectedOption, Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    private void editOrderStatus(String selectedOption) {
        //setup data to put in firebase db
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("orderStatus",""+selectedOption);
    }
}