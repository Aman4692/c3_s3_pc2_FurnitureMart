package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setGradeOfFurniture("grade 2");
        furnitureItem.setFurnitureUsage("outdoor");
        furnitureItem.setPrice(15);
        System.out.println(furnitureItem.calculateDiscount());
    }
}
