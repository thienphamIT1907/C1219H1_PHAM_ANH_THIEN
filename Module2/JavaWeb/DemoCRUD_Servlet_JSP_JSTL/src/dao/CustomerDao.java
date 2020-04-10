package dao;

import Model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<>();

    static {
        initCustomers();
    }

    private static void initCustomers() {
        Customer cus1 = new Customer(1,"Pham Anh Thien","0796606999","thien@gmail.com");
        Customer cus2 = new Customer(2,"Pham Anh Thien","0796606999","thien@gmail.com");
        Customer cus3 = new Customer(3,"Pham Anh Thien","0796606999","thien@gmail.com");
        Customer cus4 = new Customer(4,"Pham Anh Thien","0796606999","thien@gmail.com");
        Customer cus5 = new Customer(5,"Pham Anh Thien","0796606999","thien@gmail.com");

        listCUSTOMER.put(cus1.getId(), cus1);
        listCUSTOMER.put(cus2.getId(), cus2);
        listCUSTOMER.put(cus3.getId(), cus3);
        listCUSTOMER.put(cus4.getId(), cus4);
        listCUSTOMER.put(cus5.getId(), cus5);
    }

    public static Customer getCustomer(int customerId) {
        return listCUSTOMER.get(customerId);
    }

    //phuong thuc them 1 customer vao list voi dang id-customer
    public static void addCustomer(Customer customer) {
        listCUSTOMER.put(customer.getId(), customer);
    }

    public static Customer updateAndCreateCustomer(Customer customer) {
        listCUSTOMER.put(customer.getId(), customer);
        return customer;

    }

    public static void deleteCustomer(int customerId) {
        listCUSTOMER.remove(customerId);
    }

    public static List<Customer> getAllCustomer() {
        Collection<Customer> c = listCUSTOMER.values();
        List<Customer> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }
}












