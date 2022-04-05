package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NestCamTest {
//    private String brand;
//    private String name;
//    private String color;
//    private int quantity;
//    private int price;

    @Test
    public void constructorTest(){
        //Given
        String brand = "Google";
        String name = "Nest Cam";
        String color = "Grey";
        int quantity = 25;
        int price = 150;
        int model = 100;
        String serialNumber = "";
        //When
        NestCam testNestCam = new NestCam(brand, name, color, quantity, price, model, serialNumber);
        //Then
        Assertions.assertEquals(brand, testNestCam.getBrand());
        Assertions.assertEquals(name, testNestCam.getName());
        Assertions.assertEquals(color, testNestCam.getColor());
        Assertions.assertEquals(quantity, testNestCam.getQuantity());
        Assertions.assertEquals(price, testNestCam.getPrice());

    }

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

//    @Test
//    public void getNameTest(){
//        //Given
//        String name = "";
//
//        NestCam testNestCam = new NestCam();
//        //When
//        testNestCam.getName();
//        //Then
//        Assertions.assertEquals(name, testNestCam.getName());
//    }
}
