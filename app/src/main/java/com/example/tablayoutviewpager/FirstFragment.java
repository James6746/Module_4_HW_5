package com.example.tablayoutviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    RecyclerView recyclerView;
    ContactAdapter contactAdapter;
    ArrayList<Contact> contactArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = v.findViewById(R.id.contactRecyclerView);
        contactArrayList = createContactList();
        contactAdapter = new ContactAdapter(contactArrayList);

        recyclerView.setLayoutManager(new GridLayoutManager(v.getContext(), 1));
        recyclerView.setAdapter(contactAdapter);

        return v;
    }

    private ArrayList<Contact> createContactList() {
        ArrayList<Contact> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(new Contact(i + " James", "+998932006746"));
        }

        return list;
    }
}