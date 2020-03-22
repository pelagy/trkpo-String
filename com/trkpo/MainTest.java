package com.trkpo;
import org.junit.Assert;
import org.junit.Test;
import static com.trkpo.Main.reverseString;

public class MainTest {
    @Test
    public void russianStringTest(){
        String data = "чувак это репчик";
        String expectedData = "кичпер отэ кавуч";
        String actualData = reverseString(data);

        Assert.assertEquals(expectedData, actualData);
    }

    @Test
    public void negativeTest(){
        String data = "чувак это репчик";
        String expectedData = "чпер отэ кавуч";
        String actualData = reverseString(data);

        Assert.assertNotEquals(expectedData, actualData);
    }
}
