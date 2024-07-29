package org.example;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        Race race = new Race();

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++ ) {
            System.out.println("Введите название машины " + "№" + (i + 1) + ":");
            String nameCar = scanner.next();
            int speed = 0;

            while (true) {
                System.out.println("Введите скорость машины " + "№" + (i + 1) + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость. Пожалуйста, введите значение от 0 до 250.");
                    }
                } else {
                    System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }
            Car car = new Car(nameCar, speed);
            race.checkLeader(nameCar, speed); //df

        }

        System.out.println("Самая быстрая машина: " + race.getLeader());
        System.out.println("Пройденная дистанция: " + race.getDistanceCovered() + " км");
    }
    // ваш код начнется здесь
    // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
}
