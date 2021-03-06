package com.stackroute.pe4;
import com.stackroute.pe4.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TransposeStringTest {
    TransposeString transposeString;
    @Before
    public void setUp() throws Exception {
        transposeString=new TransposeString();
    }
    @After
    public void tearDown() throws Exception {
        transposeString=null;
    }
    @Test
    public void transposeStrSuccess() {
        String expectedValue="a kciuq nworb xof spmuj revo eht yzal god";
        String actualValue=transposeString.transposeStr(" a quick brown fox jumps over the lazy dog");
        actualValue=actualValue.trim();
        assertEquals(expectedValue,actualValue);
    }
}