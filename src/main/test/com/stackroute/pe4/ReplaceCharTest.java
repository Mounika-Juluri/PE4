package com.stackroute.pe4;
import com.stackroute.pe4.ReplaceChar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ReplaceCharTest {
    ReplaceChar replaceChar;
    @Before
    public void setUp() throws Exception {
        replaceChar=new ReplaceChar();
    }
    @After
    public void tearDown() throws Exception {
        replaceChar=null;
    }
    @Test
    public void charReplaceSuccess(){
        String expectedValue="faity fry";
        String actualValue=replaceChar.charReplace("daily dry");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void charReplaceFailure(){
        String expectedValue="tom jerry";
        String actualValue=replaceChar.charReplace("tom jerry");
        assertEquals(expectedValue,actualValue);
    }
}