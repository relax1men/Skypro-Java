package ru.skypro;

public class Main {
    public static void main(String[] args) {

        //number 1
        System.out.println("Задание 1");
        int cashInMonth = 15000;
        int capital = 2_459_000;
        int conservation = 0;
        int a = 0;
        while (conservation < capital) {
            System.out.println("Месяц " + a + " сумма накоплений равна " + conservation + " рублей.");
            a++;
            conservation = conservation + cashInMonth;
            conservation = conservation + conservation / 100;
        }


        //number 2
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }
        System.out.println();


        //number 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birth = 17;       // имеется в виду 17 человек в год на 1000 человек
        int death = 8;        // аналогично с рождаемостью
        int birthPerYear = population / 1000 * birth;
        int deathPerYear = population / 1000 * death;
        for (int year = 0; year <= 10; year++) {
            int changePopulation = population + ((birthPerYear - deathPerYear) * year);
            System.out.println("Год " + year + " численность населения составляет " + changePopulation);
        }


        //number 4
        System.out.println("Задание 4");
        int deposit = 15_000;
        int goal = 12_000_000;
        int percent = 7;
        int month = 0;
        int total = 0;
        while (total <= goal) {
            total = deposit + ((deposit / 100 * percent) * month);
            month++;
            System.out.println("Месяц " + month + " на счету " + total + " рублей");
        }

        //number 5
        System.out.println("Задание 5");
        month = 0;
        total = 0;
        while (total <= goal) {
            total = deposit + ((deposit / 100 * percent) * month);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " на счету " + total + " рублей");
            }
        }


        //number 6
        System.out.println("Задание 6");
        month = 0;
        total = 0;
        int years = 9;
        int allPeriod = years * 12;
        for (month = 0; month <= allPeriod; month++) {
            total = deposit + ((deposit / 100 * percent) * month);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " на счету " + total + " рублей");
            }

        }


        //number 7
        System.out.println("Задание 7");
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет");
        }

        //number 8
        System.out.println("Задание 8");
        int ourYears = 2024;
        for (years = 0; years <= ourYears + 100; years = years + 79) {
            if (years >= 1824) {
                System.out.println(years);
            }
        }


    }
}