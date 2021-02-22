package com.example.demo.controllers;

import com.example.demo.services.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FormExample {
    // Showing how to create a form using thymeleaf
    @GetMapping(value = "/form")
    public String renderForm() {
        return "form";
    }

    @GetMapping(value="/list")
    @ResponseBody
    public String renderList() {

        return "" + Post.postList;
    }
//trest
    @PostMapping(value = "/create-form")
    @ResponseBody
    public String createNewUser(@RequestParam("title") String title,@RequestParam("content") String content) {
        Post post = new Post(title, content);
        Post.postList.add(post);

        return "redirect:/success";
    }

    @GetMapping(value = "/success")
    public String creationSuccess(){
        return "You successfully created a post!";
    }
}