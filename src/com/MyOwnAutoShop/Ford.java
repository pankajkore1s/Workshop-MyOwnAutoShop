package com.MyOwnAutoShop;

public class Ford extends Car {
	private int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(manufacturerDiscount, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

}
