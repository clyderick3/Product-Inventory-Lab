package models;

public class NestCam {
    private String brand;
    private String name;
    private String color;
    private int quantity;
    private int price;
    private int model;
    private String serialNumber;


    public NestCam(String brand, String name, String color, int quantity, int price, int model, String serialNumber) {
        NestCam newNestCam = new NestCam("Google", "Nest Cam", "Grey", 25, 150, 100, "G101");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
