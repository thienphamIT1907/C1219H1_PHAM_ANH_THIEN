package com.blogapp.thien.blogapp.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(Integer id);

    void add(T model);

    void deletePost(Integer id);

}
