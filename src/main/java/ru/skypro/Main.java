package ru.skypro;

public class Main {
    public static void main(String[] args) {

        //number 1
        System.out.println("Задание 1");
        int age = 5;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человка равен " + age + " лет, то он несовершеннолетний");
        }

        //number 2
        System.out.println("Задание 2");
        int temp = -5;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }


        //number 3
        System.out.println("задание 3");
        int speed = 70;
        if (speed >= 0 && speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }

        //number 4
        System.out.println("задание 4");
        int years = 20;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в детский сад.");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в школу.");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в университет.");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить на работу.");
        } else {
            System.out.println("в других случаях человек еще не умеет ходить");
        }


        //number 5
        System.out.println("задание 5");
        int childAge = 14;
        if (childAge >= 0 && childAge < 5) {
            System.out.println("Если возраст ребенка " + childAge + " лет, то ему нельзя еще кактать на атракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка " + childAge +
                    " лет, то он может кататься на атракционе в сопровождениии взрослого.");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка " + childAge +
                    " лет, то ему можно кататься на атракционе без сопровождения");

        }


        //number 6
        System.out.println("задание 6");
        int totalPlace = 102;
        int sittingPlace = 60;
        int standingPlace = totalPlace - sittingPlace;
        int peopleInTrain = 70;
        if (peopleInTrain < sittingPlace) {
            System.out.println("В вагоне еще присутствуют сидячие места");
        } else if (peopleInTrain >= sittingPlace && peopleInTrain < totalPlace) {
            System.out.println("В вагоне уже нет сидячих мест, но есть еще стоячие");
        } else if (peopleInTrain >= totalPlace) {
            System.out.println("в вагоне больше нет мест.");
        }


        //number 7
        System.out.println("задание 7");
        int one = 100;
        int two = 500;
        int three = 300;
        if (one > two && one > three){
            System.out.println("Один больше двух и трех");
        } else if (two > one && two > three) {
            System.out.println("Два больше одного и трех");
        } else {
            System.out.println("Три больше одного и двух");
        }
        }
    }