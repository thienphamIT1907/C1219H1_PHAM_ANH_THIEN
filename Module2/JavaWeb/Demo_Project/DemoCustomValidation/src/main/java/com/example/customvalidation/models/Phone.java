package com.example.customvalidation.models;

import com.example.customvalidation.validation.ContactNumberConstraint;

public class Phone {

    @ContactNumberConstraint
    private int phoneNumber;
}
