import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharOccurancesTest {
    CharOccurances charOccurances;

    @Before
    public void setUp() throws Exception {
        charOccurances=new CharOccurances();
    }

    @After
    public void tearDown() throws Exception {
        charOccurances=null;

    }
    @Test
    public void checkoccurancesSuccess(){
        int expectedValue=5;
        int actualValue=charOccurances.checkChar("a java is java","a");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkoccurancesFailure(){
        int expectedValue=0;
        int actualValue=charOccurances.checkChar("not found","a");
        assertEquals(expectedValue,actualValue);
    }

}