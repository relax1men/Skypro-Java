package ru.skypro;

public class Main {
    public static void main(String[] args) {

        //number 1
        System.out.println("Задание 1");
        int clientOS = 1;
        int android = 1;
        int iOs = 0;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не корректная OS");
        }


        //number 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2013;
        int fixedYear = 2015;
        if (clientOS == android && clientDeviceYear < fixedYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == android && clientDeviceYear >= fixedYear) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        } else if (clientOS == iOs && clientDeviceYear < fixedYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOs && clientDeviceYear >= fixedYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Не корректная OS");
        }


        //number 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //number 4
        System.out.println("Задание 4");
        int deliveryDistance = 40;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            days = -1;
        }
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней " + days);
        }

        //number 5
        System.out.println("Задание 5");
        int monthNumber = 8;
        switch (monthNumber){
            case 1,2,12 :
                System.out.println("Зима");
                break;
            case 3,4,5 :
                System.out.println("Весна");
                break;
            case 6,7,8 :
                System.out.println("Лето");
                break;
            case 9,10,11 :
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}