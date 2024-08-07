package com.example.field_validation.controllers;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AgeValidator implements ConstraintValidator<Age, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        long diff = new Date().getTime() - value.getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);

        return age >= 18;
    }
}
