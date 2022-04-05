package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NestCamTest {
//String testNestCam;

    @Test
    public void setNameTest() {
        //Given
        String expected = "Nest Cam";

        //When
        NestCam testNestCam = new NestCam();
        testNestCam.setName(expected);
        //Then
        Assertions.assertEquals(expected, testNestCam.getName());
    }
}
