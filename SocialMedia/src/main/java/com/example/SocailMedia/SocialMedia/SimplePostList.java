package com.example.SocailMedia.SocialMedia;

import java.util.ArrayList;

public class SimplePostList implements PostList{
    ArrayList <Post> postList;

    public SimplePostList(){
        postList=new ArrayList<Post>();
    }

    @Override
    public ArrayList<Post> getAllPost() {
        return postList;
    }

    @Override
    public Post getPost(int i) {
        return postList.get(i);
    }

    @Override
    public void setPost(Post post) {
        postList.add(post);
    }

    @Override
    public int size() {
        return postList.size();
    }
}
