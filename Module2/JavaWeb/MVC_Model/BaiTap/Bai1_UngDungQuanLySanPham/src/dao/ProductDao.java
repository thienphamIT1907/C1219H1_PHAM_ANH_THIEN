package dao;

import model.Product;

import java.util.*;

public class ProductDao {
    private static final Map<Integer, Product> listProduct = new HashMap<>();

    static {
        initProduct();
    }

    private static void initProduct() {
        Product product1 = new Product(1, "Iphone", 15000, "Iphone XS Max");
        Product product2 = new Product(2, "Xiaomi", 39000, "Xiaomi Redmi Note 5");
        Product product3 = new Product(3, "Huawei", 40000, "Huawei Nova 3i");
        Product product4 = new Product(4, "Samsung", 90000, "Samsung Galaxy S10");
        Product product5 = new Product(5, "Oppo", 27000, "Oppo Find X");

        listProduct.put(product1.getId(), product1);
        listProduct.put(product2.getId(), product2);
        listProduct.put(product3.getId(), product3);
        listProduct.put(product4.getId(), product4);
        listProduct.put(product5.getId(), product5);
    }

    public static Product getProduct(int productId) {
        return listProduct.get(productId);
    }

    public static void addProduct(Product product) {
        listProduct.put(product.getId(), product);
    }

    public static Product updateAndCreateProduct(Product product) {
        listProduct.put(product.getId(),product);
        return product;
    }

    public static void deleteProduct(int productId) {
        listProduct.remove(productId);
    }

    //convert map to list for show
    public static List<Product> getAllProduct() {
        Collection<Product> c = listProduct.values();
        List<Product> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }

}
