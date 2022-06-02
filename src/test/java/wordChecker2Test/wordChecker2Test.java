package wordChecker2Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class wordChecker2Test {
    @Test
    public void testUpper(){
        wordChecker2 wordChecker2Test = new wordChecker2();
        Assertions.assertEquals(true, wordChecker2.isUpper("Hello"));
        Assertions.assertEquals(true, wordChecker2.isUpper("goodBye"));
        Assertions.assertNotEquals(false, wordChecker2.isUpper("hello"));
    }

    @Test
    public void testLower(){
        wordChecker2 wordChecker2Test = new wordChecker2();
        Assertions.assertEquals(true, wordChecker2.isLower("Hello"));
        Assertions.assertEquals(true, wordChecker2.isLower("goodBye"));
    }

    @Test
    public void testNumber(){
        wordChecker2 wordChecker2Test = new wordChecker2();
        Assertions.assertEquals(true, wordChecker2.isNumber("7540783"));
        Assertions.assertEquals(false, wordChecker2.isNumber("goodBye"));
        Assertions.assertNotEquals(true, wordChecker2.isNumber("hello"));
    }



}
