package com.stackroute.pe4;
import com.stackroute.pe4.FindWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class FindWordTest {
    FindWord findWord;
    @Before
    public void setUp() throws Exception {
        findWord=new FindWord();
    }
    @After
    public void tearDown() throws Exception {
        findWord=null;
    }
    @Test
    public void findHarrySuccess() {
        Boolean expectedValue=true;
        Boolean actualValue=findWord.findHarry("This is Harry.");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void findHarryFailure() {
        Boolean expectedValue=false;
        Boolean actualValue=findWord.findHarry("This is Henry.");
        assertEquals(expectedValue,actualValue);
    }
}