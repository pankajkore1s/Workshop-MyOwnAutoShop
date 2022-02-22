package com.MyOwnAutoShop;

public class MyShop {
	public static void main(String[] args) {
		Truck truck=new Truck(120,5000,"Brown",2200);
        Sedan Sedan = new Sedan(260, 800, "red",6);
        Ford Figo = new Ford(220, 500, "black", 2021,10);
        Ford Everest = new Ford(260,1200, "yellow", 2020, 15);
        Car car = new Car(100, 100, "white");
        System.out.println("Sdean car "+Sedan.getSalePrice());
        System.out.println("Ford Figo "+Figo.getSalePrice());
        System.out.println("Ford Everest "+Everest.getSalePrice());
        System.out.println("car "+car.getSalePrice());
        System.out.println("Truck "+truck.getSalePrice());
    }

}
