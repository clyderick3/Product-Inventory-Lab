package models;

public class NestCam {
    private String brand;
    private String name;
    private String color;
    private int quantity;
    private float price;

    public NestCam(){
        NestCam newNestCam = new NestCam();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
