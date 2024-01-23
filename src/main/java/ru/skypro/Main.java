package ru.skypro;

public class Main {
    public static void main(String[] args) {
        //number 1
        System.out.println("задание 1");
        var dog = 8d;
        var cat = 3.6d;
        var paper = 763789d;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //number 2
        System.out.println("задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //number 3
        System.out.println("задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //number 4
        System.out.println("задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //number 5
        System.out.println("задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //number 6
        System.out.println("задание 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var amountWeight = firstBoxer + secondBoxer;
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println(amountWeight);
        System.out.println(differenceWeight);

        //number 7
        System.out.println("задание 7");       // вычитание в задании выше
        var differenceWeightSecondWay = secondBoxer % firstBoxer;
        System.out.println(differenceWeight);
        System.out.println(differenceWeightSecondWay);

        //number 8
        System.out.println("задание 8");
        var generalHours = 640;
        var personalHours = 8;
        var numberOfEmployees = generalHours / personalHours;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        var totalHours = numberOfEmployees * personalHours;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего "
                + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}