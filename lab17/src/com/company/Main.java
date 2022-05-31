package com.company;

abstract class deliverFactory{
    public abstract deliverMethod createTrans();
}
abstract class deliverMethod{
    public abstract void getInfo();
}
class WaterFactory extends deliverFactory{
    public Boat createTrans(){
        return new Boat();
    }
}
class RoadFactory extends deliverFactory{
    public Car createTrans(){
        return new Car();
    }
}
class AirFactory extends deliverFactory{
    public Airplane createTrans(){
        return new Airplane();
    }
}
class Car extends deliverMethod{
    public void getInfo(){
        System.out.println("Машина");
    }
}
class Boat extends deliverMethod{
    public void getInfo(){
        System.out.println("Грузовой корабль");
    }
}
class Airplane extends deliverMethod{
    public void getInfo(){
        System.out.println("Грузовой Самолёт");
    }
}
public class Main {

    public static void main(String[] args) {
        deliverFactory car = new RoadFactory();
        deliverFactory boat = new WaterFactory();
        deliverFactory airplane = new AirFactory();
        deliverMethod Car = car.createTrans();
        deliverMethod Boat = boat.createTrans();
        deliverMethod Air = airplane.createTrans();
        Car.getInfo();
        Boat.getInfo();
        Air.getInfo();
    }
}
