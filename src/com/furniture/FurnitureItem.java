package com.furniture;

import java.util.Objects;

public class FurnitureItem {

    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private int price;
    private int furnitureCode;
    static final float DISCOUNT = 5;

    FurnitureItem(){}

    public void setFurnitureType(String furnitureType){
        this.furnitureType = furnitureType;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public int getPrice() {
        return price;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public float calculateDiscount(){
        if("grade1".equals(getGradeOfFurniture()) && "outdoor".equals(getFurnitureUsage())){
            return  getPrice() - (getPrice() * DISCOUNT / 100);
        }
        else
           return getPrice();
    }
}
