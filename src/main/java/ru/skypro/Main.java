package ru.skypro;

public class Main {
    public static void main(String[] args) {

        //number 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        //number 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //number 3
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //number 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //number 5
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        //number 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //number 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //number 8
        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей.");
        }

        //number 9
        System.out.println("Задание 9");      // в этой задаче цикл вроде работает, но по числам как будто не бьет
        int salaryForDeposit = 29000;
        int capital = 0;
        for (int i = 1; i <= 12; i++) {
            capital = capital + capital / 100;
            capital = capital + salaryForDeposit;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + capital + " рублей.");
        }

        //number 10
        System.out.println("Задание 10");
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}