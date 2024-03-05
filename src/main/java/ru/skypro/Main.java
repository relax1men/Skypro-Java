package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        writeYear(2024);
        writeVersion(1, 2020);
        int deliveryDays = calculateDeliveryDays(95);
        if (deliveryDays != -1) {
            System.out.println("Количество дней доставки: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

    }


    static void writeYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    static void writeVersion(int os, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию для iOS");
        } else if (os == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (os == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию для Android");

        } else if (os == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите олегченную версию для Android");
        } else {
            System.out.println("Некорректная OS");
        }


    }

    static int calculateDeliveryDays(int distance) {
        System.out.println("Задача 3");

        if (distance < 0 || distance > 100) {
            return -1;

        }
        int deliveryDays = 1;
        if (distance >= 20) {
            deliveryDays++;

        }
        if (distance >= 60) {
            deliveryDays++;
        }
        return deliveryDays;

    }

}