package ru.skypro;


import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        HogwartsStudent garry = generateGriffindorStudent("Гарри Поттер");
        HogwartsStudent ron = generateGriffindorStudent("Рон Уизли");
        HogwartsStudent germeona = generateGriffindorStudent("Гермиона Грейнджер");
        HogwartsStudent zaharia = generatePuffenduyStudent("Захария Смит");
        HogwartsStudent sedrik = generatePuffenduyStudent("Седрик Диггори");
        HogwartsStudent justin = generatePuffenduyStudent("Джастин Флетч");
        HogwartsStudent malfoi = generateSlizerineStudent("Драко Малфой");
        HogwartsStudent grahem = generateSlizerineStudent("Грахем Монтегю");
        HogwartsStudent gregory = generateSlizerineStudent("Грегори Гойл");
        HogwartsStudent chjou = generateKogtevranStudent("Чжоу Чанг");
        HogwartsStudent padma = generateKogtevranStudent("Падма Патил");
        HogwartsStudent markus = generateKogtevranStudent("Маркус Белби");
        chjou.compareToStudent(justin);
        chjou.print();
        justin.print();
        sedrik.compareToStudent(zaharia);
        sedrik.print();
        zaharia.print();
        markus.compareToStudent(garry);
        markus.print();
        garry.print();

    }

    private static GriffindorStudent generateGriffindorStudent(String name) {
        return new GriffindorStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static PuffenduyStudent generatePuffenduyStudent(String name) {
        return new PuffenduyStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static KogtevranStudent generateKogtevranStudent(String name) {
        return new KogtevranStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static SlizerineStudent generateSlizerineStudent(String name) {
        return new SlizerineStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100),
        ThreadLocalRandom.current().nextInt(0, 100)
        );
    }
}

