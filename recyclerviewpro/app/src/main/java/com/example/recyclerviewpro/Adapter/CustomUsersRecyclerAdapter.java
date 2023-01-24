package com.example.recyclerviewpro.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpro.models.UserModel;

import java.util.ArrayList;

public class CustomUsersRecyclerAdapter extends RecyclerView.Adapter<CustomUsersRecyclerAdapter.ViewHolder>{

    ArrayList<UserModel> userModels_arr;
    private Context context;

    @NonNull
    @Override
    public CustomUsersRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomUsersRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
