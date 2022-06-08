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


}





