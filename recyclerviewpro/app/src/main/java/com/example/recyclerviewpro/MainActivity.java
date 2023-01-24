package com.example.recyclerviewpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.example.recyclerviewpro.Adapter.CustomUsersRecyclerAdapter;
import com.example.recyclerviewpro.models.UserModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<UserModel> userModels_arr = new ArrayList<UserModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rc_view_list);

        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background,"Shashank",  "shashank@gmail.com",  "9305962119"));
        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background, "Saurabh",  "Saurabh@gmail.com",  "9305962118"));
        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background,"Sakshi",  "sakshi@gmail.cosm",  "93059621134"));

        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background,"Amit",  "amit@gmail.com",  "8005962119"));
        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background, "Anuj",  "anuj@gmail.com",  "8505962118"));
        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background,"Anjaney",  "anjaney@gmail.cosm",  "90059621134"));

        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background,"Prashant",  "prashant@gmail.com",  "9505962119"));
        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background, "Prabhat",  "prabhat@gmail.com",  "7505962118"));
        userModels_arr.add(new UserModel(R.drawable.ic_launcher_background,"Pramod",  "pramod@gmail.com",  "70059621134"));
        // default constructor.
        CustomUsersRecyclerAdapter adapter = new CustomUsersRecyclerAdapter(getApplicationContext(), userModels_arr);

//        String[] Output = {
//
//                ""+UserModels_arr.get(0).getImage(),
//                ""+UserModels_arr.get(1).getImage(),
//                ""+UserModels_arr.get(2).getImage(),
//
//                userModels_arr.get(0).getName(),
//                userModels_arr.get(1).getName(),
//                userModels_arr.get(2).getName(),
//
//                userModels_arr.get(0).getEmail(),
//                userModels_arr.get(1).getEmail(),
//                userModels_arr.get(2).getEmail(),
//
//                userModels_arr.get(0).getMobile(),
//                userModels_arr.get(1).getMobile(),
//                userModels_arr.get(2).getMobile(),
//
//        };
//
//        Log.d(tag: "mydatalist", Array.toString());
    recyclerView.setLayoutManager(new LinearLayoutManager((getApplicationContext())));
    recyclerView.setAdapter(adapter);

    }
}