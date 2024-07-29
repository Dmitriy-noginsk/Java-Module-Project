package org.example;

public class Car {
    String nameCar; //объявили параметры
    int speed;
    public Car(String nameCar, int speed) {
        this.nameCar = nameCar;
        this.speed = speed;
    }

    public String getNameCar() {
        return nameCar;
    }
    public int getSpeed() {
        return speed;
    }
    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
