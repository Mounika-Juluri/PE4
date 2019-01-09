import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTextTest {
    SortText sortText;

    @Before
    public void setUp() throws Exception {
        sortText = new SortText();
    }

    @After
    public void tearDown() throws Exception {
        sortText = null;
    }
    public void stringSortSuccess(){
        String expectedValue="and jerry tom";
        String actualValue=sortText.stringSort("tom and jerry");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void stringSort() {
        String expectedValue="and jerry tom";
        String actualValue=sortText.stringSort("tom and jerry");
        actualValue=actualValue.trim();
        assertEquals(expectedValue,actualValue);
    }

}