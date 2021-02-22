package com.example.demo.services;

import java.util.ArrayList;

public class Post {

    public String title;
    public String content;
    public static ArrayList<Post> postList = new ArrayList<>();

    public Post(String title, String content){
    this.title = title;
    this.content = content;
    }

    @Override
    public String toString() {
        return "Posts " +
                "title: " + title +
                " content: " + content;
    }
}
