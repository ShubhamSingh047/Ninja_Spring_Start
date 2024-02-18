package com.example.SocailMedia.SocialMedia;

import java.util.ArrayList;

public class SimplePost implements Post{

    String post;

    @Override
    public void setMessage(String post) {
        this.post=post;
    }

    @Override
    public String getPost() {
        return post;
    }
}
