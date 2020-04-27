package com.blogapp.thien.blogapp.services;

import com.blogapp.thien.blogapp.models.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Integer id);

    void add(Blog blog);

    void deletePost(Integer id);
}
