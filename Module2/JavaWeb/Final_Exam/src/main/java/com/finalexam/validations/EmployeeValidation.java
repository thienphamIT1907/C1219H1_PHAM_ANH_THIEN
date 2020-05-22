//package com.finalexam.validations;
//
//import com.finalexam.models.DiscountEvent;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//
//public class EmployeeValidation implements Validator {
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return DiscountEvent.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        DiscountEvent discountEvent = (DiscountEvent) target;
//        if(!discountEvent.get().matches("[a-z]@gmail.com")) {
//            errors.rejectValue("email","email invalid");
//        }
//    }
//}
