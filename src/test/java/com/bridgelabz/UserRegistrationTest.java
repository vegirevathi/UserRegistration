package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Revathi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenFirstName_whenNotProper_shouldReturn_False() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("revathi");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Vegi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_True_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("vegi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_whenProper_shouldReturn_True_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc@bl.co");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPhoneNumber_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNUmber("91 1234567890");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassWord_Rule1_whenProper_sholudReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule2("msedf1234");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_rule2_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule2("Asdf1234");
        Assert.assertTrue(isValid);
    }
}
