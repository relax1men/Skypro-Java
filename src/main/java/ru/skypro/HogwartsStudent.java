package ru.skypro;

public abstract class HogwartsStudent {
    private String name;
    private int powerMagic;
    private int transrgessionDistance;

    public HogwartsStudent(String name, int powerMagic, int transrgessionDistance) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transrgessionDistance = transrgessionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {

        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransrgessionDistance() {
        return transrgessionDistance;
    }

    public void setTransrgessionDistance(int transrgessionDistance) {
        this.transrgessionDistance = transrgessionDistance;
    }

    private int sumOfBaseCharacteristic() {
        return powerMagic + transrgessionDistance;
    }

    protected abstract int sumOfCharacteristic();

    protected void compareToStudent(HogwartsStudent hogwartsStudent) {
        int sumOfCharacteristic1 = this.sumOfBaseCharacteristic();
        int sumOfCharacteristic2 = hogwartsStudent.sumOfBaseCharacteristic();
        if (sumOfCharacteristic1 > sumOfCharacteristic2) {
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n ",
                    this.getName(),
                    hogwartsStudent.getName(),
                    sumOfCharacteristic1,
                    sumOfCharacteristic2
            );
        } else if (sumOfCharacteristic1 < sumOfCharacteristic2) {
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n ",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristic2,
                    sumOfCharacteristic1
            );

        } else {

            System.out.printf("Студент %s и студент %s одинаковые (%d vs %d)%n ",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristic2,
                    sumOfCharacteristic1
            );

        }
    }

    @Override
    public String toString() {
        return "%s , сила магии: %d , сила трансгрессии : %d".formatted(name, powerMagic, transrgessionDistance);
    }

    public void compareToHogwartsStudent(HogwartsStudent hogwartsStudent) {
        int sumOfCharacteristic1 = this.sumOfBaseCharacteristic();
        int sumOfCharacteristic2 = hogwartsStudent.sumOfBaseCharacteristic();
        if (sumOfCharacteristic1 > sumOfCharacteristic2) {
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n ",
                    this.getName(),
                    hogwartsStudent.getName(),
                    sumOfCharacteristic1,
                    sumOfCharacteristic2
            );
        } else if (sumOfCharacteristic1 < sumOfCharacteristic2) {
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n ",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristic2,
                    sumOfCharacteristic1
            );

        } else {

            System.out.printf("Студент %s и студент %s одинаковые (%d vs %d)%n ",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristic2,
                    sumOfCharacteristic1
            );

        }
    }
    public void print(){
        System.out.println(this);
    }
}


