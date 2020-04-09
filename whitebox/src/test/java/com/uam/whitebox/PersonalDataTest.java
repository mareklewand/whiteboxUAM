package com.uam.whitebox;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonalDataTest {

    public PersonalData pd = new PersonalData();

    @Test
    public void shouldReturnTrueIfFirstNameIsValid()  {
        assertEquals(pd.validateName("jacek"), true);
    }

    @Test
    public void shouldReturnFalseIfFirstNameIsInvalid()  {
        assertEquals(pd.validateName("jacek@"), false);
    }

    @Test
    public void shouldReturnTrueIfSurnameIsValid()  {
        assertEquals(pd.validateSurname("Kosiniak-Kamysz"), true);
    }

    @Test
    public void shouldReturnFalseIfSurnameIsInvalid()  {
        assertEquals(pd.validateSurname("Lewandowski; drop table users"), false);
    }

    @Test
    public void shouldReturnTrueIfPhoneNumberIsValid() {
        assertEquals(pd.validatePhoneNumber("618422783"), true);
    }

    @Test
    public void shouldReturnFalseIfPhoneNumberIsInvalid() {
        assertEquals(pd.validatePhoneNumber("+48618422783"), false);
    }
}
