package ru.skypro;

public class Main {
    public static void main(String[] args) {

        //number 1
        System.out.println("задание 1");
        int a = 1000;
        byte b = 50;
        short o = 3000;
        long d = 500;
        float f = 3.14f;
        double e = 5.5;
        System.out.println("Значение переменной а с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной o с типом short равно " + o);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной e с типом double равно " + e);

        //number 2
        float x = 27.12f;
        long y = 987768965549L;
        double z = 2.786;
        int u = 569;
        short p = -159;
        char k = 27897;
        byte h = 67;

        //number 3
        System.out.println("задание 3");
        int lydPav = 23;
        int annSer = 27;
        int ektAnd = 30;
        int sumPaper = 480;
        int paperForStudent = sumPaper / (lydPav + annSer + ektAnd);
        System.out.println("На каждого ученика расчитано " + paperForStudent + " листов бумаги");

        //number 4
        System.out.println("задание 4");
        int min2 = 16;
        int bottlePerMinute = min2 / 2;
        int min20 = bottlePerMinute * 20;
        int day1 = (min20 * 3) * 24;
        int day3 = day1 * 3;
        int month1 = day1 * 30;
        System.out.println("За 20 минут машина произвела " + min20 + " бутылок");
        System.out.println("За сутки машина произвела " + day1 + " бутылок");
        System.out.println("За 3 суток машина произвела " + day3 + " бутылок");
        System.out.println("За месяц машина произвела " + month1 + " бутылок");

        //number 5
        System.out.println("задание 5");
        int totalPaint = 120;
        int paintForRoom = 6;
        int totalRoom = totalPaint / paintForRoom;
        int whitePaint = totalRoom * 2;
        int brownPaint = totalRoom * 4;
        System.out.println("В школе, где " + totalRoom + " классов, нужно " + whitePaint + " банок белой краски и "
                + brownPaint + " банок коричневой краски");

        //number 6
        System.out.println("задание 6");
        int bananaWeight = 80;
        int milkWeight = 105;
        int sundaeWeight = 100;
        int eggWeight = 70;
        int cocktailWeight = (bananaWeight * 5) + (sundaeWeight * 2) + (milkWeight * 2) + (eggWeight * 4);
        float kgCocktailWeight = cocktailWeight / 1000f; //перевод в кг
        System.out.println("Коктейль спортсмена весит " + cocktailWeight + " грамм или " + kgCocktailWeight + " кг");

        //number 7
        System.out.println("задание 7");
        int excessWeight = 7;
        int minKgPerDay = 250;
        int maxKgPerDay = 500;
        int excessWeightGram = excessWeight * 1000;
        int maxDayWeightLoss = excessWeightGram / minKgPerDay;
        int minDayWeightLoss = excessWeightGram / maxKgPerDay;
        int averageDayWeightLoss = (maxDayWeightLoss + minDayWeightLoss) / 2;
        System.out.println("Если спортсмен будет сбрасывать по " + minKgPerDay + "гр в день, то " + excessWeight +
                " кг он сбросит за " + maxDayWeightLoss + " дней");
        System.out.println("Если спортсмен будет сбрасывать по " + maxKgPerDay + "гр в день, то " + excessWeight +
                " кг он сбросит за " + minDayWeightLoss + " дней");
        System.out.println("В среднем спортсмен сбросит " + excessWeight + " кг за " + averageDayWeightLoss + " дней");

        //number 8
        System.out.println("задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = salaryMasha + (salaryMasha / 100 * 10); //месячная зп после повышения
        int newSalaryDenis = salaryDenis + (salaryDenis / 100 * 10);
        int newSalaryKristina = salaryKristina + (salaryKristina / 100 * 10);
        int riseYearSalaryMasha = (newSalaryMasha * 12) - (salaryMasha * 12); //рост годового дохода
        int riseYearSalaryDenis = (newSalaryDenis * 12) - (salaryDenis * 12);
        int riseYearSalaryKristina = (newSalaryKristina * 12) - (salaryKristina * 12);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
                + riseYearSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на "
                + riseYearSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на "
                + riseYearSalaryKristina + " рублей.");

            }
}