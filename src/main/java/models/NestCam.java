package models;

public class NestCam {
    private String brand;
    private String name;
    private String color;
    private int quantity;
    private int price;
    private int model;
    private String serialNumber;

    public NestCam(){
        NestCam newNestCam = new NestCam("Google", "Nest Cam", "Grey", 25, 150);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
