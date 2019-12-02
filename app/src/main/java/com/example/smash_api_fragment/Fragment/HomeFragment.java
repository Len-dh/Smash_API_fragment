package com.example.smash_api_fragment.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smash_api_fragment.R;
import com.example.smash_api_fragment.adapter.MyAdapter;
import com.example.smash_api_fragment.model.Fighters;
import com.example.smash_api_fragment.model.MainController;

import java.util.List;

public class HomeFragment extends Fragment {

    private MainController controller;
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myRecyclerAdapter;
    private RecyclerView.LayoutManager myRecyclerLayout;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_home, container, false);

        myRecyclerView = v.findViewById(R.id.recyclerview);

        controller = new MainController(this);
        controller.onCreate();

    return v;
    }

    public void showList(List<Fighters> list) {
        //utilise un layout lineaire
        myRecyclerLayout = new LinearLayoutManager(getContext());
        myRecyclerView.setLayoutManager(myRecyclerLayout);

        //specifie notre adaptateur
        myRecyclerAdapter = new MyAdapter(list);
        myRecyclerView.setAdapter(myRecyclerAdapter);
    }
}
