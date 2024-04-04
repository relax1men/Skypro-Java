package ru.skypro;


import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent garry = generateGriffindorStudent("Гарри Поттер");
        GriffindorStudent ron = generateGriffindorStudent("Рон Уизли");
        GriffindorStudent germeona = generateGriffindorStudent("Гермиона Грейнджер");
        PuffenduyStudent zaharia = generatePuffenduyStudent("Захария Смит");
        PuffenduyStudent sedrik = generatePuffenduyStudent("Седрик Диггори");
        PuffenduyStudent justin = generatePuffenduyStudent("Джастин Флетч");
        SlizerineStudent malfoi = generateSlizerineStudent("Драко Малфой");
        SlizerineStudent grahem = generateSlizerineStudent("Грахем Монтегю");
        SlizerineStudent gregory = generateSlizerineStudent("Грегори Гойл");
        KogtevranStudent chjou = generateKogtevranStudent("Чжоу Чанг");
        KogtevranStudent padma = generateKogtevranStudent("Падма Патил");
        KogtevranStudent markus = generateKogtevranStudent("Маркус Белби");
        chjou.compareToStudent(justin);
        chjou.print();
        justin.print();
        sedrik.compareTo(zaharia);
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

