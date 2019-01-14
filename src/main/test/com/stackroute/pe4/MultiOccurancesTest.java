package com.stackroute.pe4;
import com.stackroute.pe4.MultiOccurances;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class MultiOccurancesTest {
    MultiOccurances multiOccurances;
    @Before
    public void setUp() throws Exception {
        multiOccurances=new MultiOccurances();
    }
    @After
    public void tearDown() throws Exception {
        multiOccurances=null;
    }
    @Test
    public void findwordSuccess() {
        String expectedValue="found at:4-6found at:10-12found at:27-29" ;

        String actualValue=multiOccurances.findword("She sells seashells by the seashore.");
        assertEquals(expectedValue,actualValue);
    }
}