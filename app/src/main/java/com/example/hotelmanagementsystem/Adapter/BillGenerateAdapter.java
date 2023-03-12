package com.example.hotelmanagementsystem.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelmanagementsystem.Activity.Bill_Generate_Activity;
import com.example.hotelmanagementsystem.Model.ModelBillGenerate;
import com.example.hotelmanagementsystem.Model.ModelOrderDetails;
import com.example.hotelmanagementsystem.R;

import java.util.ArrayList;

public class BillGenerateAdapter extends RecyclerView.Adapter<BillGenerateAdapter.MyHolder> {

    private Context context;
    private ArrayList<ModelBillGenerate> billGenerateArrayList;

    public  BillGenerateAdapter(Context context , ArrayList billGenerateArrayList){
        this.context = context;
        this.billGenerateArrayList = billGenerateArrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bill_generate_details,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        nextIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, Bill_Generate_Activity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return billGenerateArrayList.size();
    }

    TextView orderIdTv , userIdTv , amountTv , orderDateTv;
    ImageView nextIv;

    public class MyHolder extends RecyclerView.ViewHolder {
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            orderIdTv = itemView.findViewById(R.id.orderIdTv);
            userIdTv = itemView.findViewById(R.id.userIdTv);
            amountTv = itemView.findViewById(R.id.amountTv);
            orderDateTv = itemView.findViewById(R.id.orderDateTv);
            nextIv = itemView.findViewById(R.id.nextIv);
        }
    }
}
