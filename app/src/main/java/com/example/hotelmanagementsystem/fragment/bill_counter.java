package com.example.hotelmanagementsystem.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelmanagementsystem.Adapter.BillGenerateAdapter;
import com.example.hotelmanagementsystem.Model.ModelBillGenerate;
import com.example.hotelmanagementsystem.R;

import java.util.ArrayList;

public class bill_counter extends Fragment {

    private RecyclerView recyclerView;
    private BillGenerateAdapter adapter;
    private ArrayList<ModelBillGenerate> billGenerateArrayList;

    public bill_counter() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bill_counter, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        billGenerateArrayList = new ArrayList<>();

        ModelBillGenerate o1 = new ModelBillGenerate("1","U1","$1200.0","12/03/2003");
        ModelBillGenerate o2 = new ModelBillGenerate("2","U2","$1400.0","12/03/2003");
        ModelBillGenerate o3 = new ModelBillGenerate("3","U3","$1300.0","12/03/2003");

        billGenerateArrayList.add(o1);
        billGenerateArrayList.add(o2);
        billGenerateArrayList.add(o3);

        //set adapter
        adapter = new BillGenerateAdapter(getContext(),billGenerateArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));


        return view;
    }
}