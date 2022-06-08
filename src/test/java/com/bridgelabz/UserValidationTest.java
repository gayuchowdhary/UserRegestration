package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserValidationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserValidation user = new UserValidation();
        boolean isValid = user.validateFirstName("gayu");
        boolean result = true;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTure() {
        UserValidation user = new UserValidation();
        boolean isValid = user.validateLastName("chowdhary");
        boolean result = true;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidation user = new UserValidation();
        boolean isValid = user.validateEmail("gayuchowdhary51@gmail.com");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        UserValidation user = new UserValidation();
        boolean isValid = user.validateMobile("91 9959043687");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidation user = new UserValidation();
        boolean isValid = user.validatePassword("Gadyuu@5");
        Assert.assertTrue(isValid);
    }

}







