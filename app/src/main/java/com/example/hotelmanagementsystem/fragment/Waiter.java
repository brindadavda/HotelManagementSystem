package com.example.hotelmanagementsystem.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelmanagementsystem.Adapter.OrderRecoredDetailsAdapter;
import com.example.hotelmanagementsystem.Adapter.roomListAdapter;
import com.example.hotelmanagementsystem.Model.ModelOrderDetails;
import com.example.hotelmanagementsystem.R;

import java.util.ArrayList;

public class Waiter extends Fragment {


    RecyclerView recyclerView;
    OrderRecoredDetailsAdapter orderRecoredDetailsAdapter;
    ArrayList<ModelOrderDetails> modelOrderDetailsArrayList;

    public Waiter() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_waiter, container, false);


        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        modelOrderDetailsArrayList = new ArrayList<>();

        ModelOrderDetails order1 = new ModelOrderDetails("1","12/03/2003","In Progress","12.34","U1");
        ModelOrderDetails order2 = new ModelOrderDetails("2","15/03/2003","Cancel","30.34","U2");
        ModelOrderDetails order3 = new ModelOrderDetails("3","12/03/2003","Completed","33.89","U3");

        modelOrderDetailsArrayList.add(order1);
        modelOrderDetailsArrayList.add(order2);
        modelOrderDetailsArrayList.add(order3);


        orderRecoredDetailsAdapter = new OrderRecoredDetailsAdapter(view.getContext(),modelOrderDetailsArrayList);
        recyclerView.setAdapter(orderRecoredDetailsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));


        return view;
    }
}