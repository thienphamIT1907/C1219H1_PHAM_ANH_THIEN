package com.example.quanlysanpham.service;

import com.example.quanlysanpham.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements ProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", 150000, "Iphone XS Max"));
        products.put(2, new Product(2, "Samsung", 380000, "Samsung Galaxy Note 10"));
        products.put(3, new Product(3, "Huawei", 185000, "Huawei Nova 3i"));
        products.put(4, new Product(4, "Xiaomi", 980000, "Xiaomi Redmi Note 9"));
        products.put(5, new Product(5, "Nokia", 210000, "Nokia 8100i"));
        products.put(6, new Product(6, "Oppo", 740000, "Oppo Find X"));
    }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public void update(int id, Product product){
        products.put(id, product);
    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}
