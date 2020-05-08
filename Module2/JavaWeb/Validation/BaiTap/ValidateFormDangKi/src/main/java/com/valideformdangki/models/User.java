package com.valideformdangki.models;

import javax.validation.constraints.*;

public class User {

    @NotEmpty(message = "Ten khong duoc de trong")
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty(message = "Ten khong duoc de trong")
    private String lastName;

    @Pattern(regexp = "\\d{10}", message = "Toi da 10 so")//Pattern chỉ dùng cho String
    private int phoneNumber;

    @Size(min = 18, message = ">= 18 tuoi")
    private int age;

    @Email(message = "Sai dinh dang email")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, int phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
