package com.example.tablayoutviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {

    RecyclerView recyclerView;
    PostAdapter postAdapter;
    ArrayList<Post> postArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        recyclerView = view.findViewById(R.id.rv_post);
        postArrayList = createPostList();
        postAdapter = new PostAdapter(postArrayList);

        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        recyclerView.setAdapter(postAdapter);
        return view;
    }

    private ArrayList<Post> createPostList() {
        ArrayList<Post> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(new Post("Tashkent", getResources().getString(R.string.info), 125));
        }

        return list;
    }
}