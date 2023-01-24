package com.example.recyclerviewpro.models;

import androidx.recyclerview.widget.RecyclerView;

public class UserModel extends RecyclerView.ViewHolder {
    private Integer image; // R.id.imageName => integer
    private String name, email, mobile; // String

    //setter

    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public UserModel(Integer image, String name, String email, String mobile) {
        this.image = image;
        this.name = name;
        this.email = email;
        this.mobile = mobile;

    }
}
