package com.example.tablayoutviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    RecyclerView recyclerView;
    UserAdapter userAdapter;
    ArrayList<User> userArrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        recyclerView = view.findViewById(R.id.rv_user);
        userArrayList = createUserList();
        userAdapter = new UserAdapter(userArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        recyclerView.setAdapter(userAdapter);

        return view;
    }

    private ArrayList<User> createUserList() {
        ArrayList<User> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(new User(i + " Asadbek", 22, i * i + 1002));
        }
        return list;
    }
}