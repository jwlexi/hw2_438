package com.example.hw2_438;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public login loginActivity;
    @Test
    public void invalidPass() {
        String username = "lexi";
        String password = "lmfao";
        assertEquals("wrong password", login.isValidCredentials(username, password));
    }

    @Test
    public void invalidUser() {
        String username = "jamesCharles";
        String password = "123";
        assertEquals("wrong user", login.isValidCredentials(username, password));
    }

    @Test
    public void valid() {
        String username = "lexi";
        String password = "lol";
        assertEquals("valid", login.isValidCredentials(username, password));
    }
}