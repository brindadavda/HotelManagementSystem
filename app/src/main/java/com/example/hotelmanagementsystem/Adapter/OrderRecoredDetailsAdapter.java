package com.example.hotelmanagementsystem.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelmanagementsystem.Activity.OrderDetailsActivity;
import com.example.hotelmanagementsystem.Model.ModelOrderDetails;
import com.example.hotelmanagementsystem.R;

import java.util.ArrayList;

public class OrderRecoredDetailsAdapter extends RecyclerView.Adapter<OrderRecoredDetailsAdapter.MyHolder> {

    private Context context ;
    private ArrayList<ModelOrderDetails> modelOrderDetailslist;

    public OrderRecoredDetailsAdapter(Context context, ArrayList<ModelOrderDetails> modelOrderDetailslist) {
        this.context = context;
        this.modelOrderDetailslist = modelOrderDetailslist;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_order_details_record,parent,false);
        return new OrderRecoredDetailsAdapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        nextIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, "activity started.", Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context, OrderDetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelOrderDetailslist.size();
    }


    TextView orderIdTv , userIdTv , amountTv , orderDateTv , statusTv;
    ImageView nextIv;

    public class MyHolder extends RecyclerView.ViewHolder{
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            nextIv = itemView.findViewById(R.id.nextIv);
            orderIdTv = itemView.findViewById(R.id.orderIdTv);
            userIdTv = itemView.findViewById(R.id.userIdTv);
            amountTv = itemView.findViewById(R.id.amountTv);
            orderDateTv = itemView.findViewById(R.id.orderDateTv);
            statusTv = itemView.findViewById(R.id.statusTv);
        }
    }
}
