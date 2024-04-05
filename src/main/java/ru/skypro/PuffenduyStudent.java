package ru.skypro;

public class PuffenduyStudent extends HogwartsStudent {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public PuffenduyStudent(String name, int powerMagic, int transrgessionDistance, int industriousness,
                            int loyalty, int honesty) {
        super(name, powerMagic, transrgessionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {

        return industriousness;
    }

    public void setIndustriousness(int industriousness) {

        this.industriousness = industriousness;
    }

    public int getLoyalty() {

        return loyalty;
    }

    public void setLoyalty(int loyalty) {

        this.loyalty = loyalty;
    }

    public int getHonesty() {

        return honesty;
    }

    public void setHonesty(int honesty) {

        this.honesty = honesty;
    }

    @Override
    protected int sumOfCharacteristic() {

        return industriousness + loyalty + honesty;
    }

    public void compareTo(PuffenduyStudent puffenduyStudent) {
        compareToStudent(puffenduyStudent);
    }

    @Override
    public String toString() {
        return super.toString() + " , трудолюбие: %d , верность: %d , честноссть: %d ".formatted(industriousness,loyalty,honesty);
    }
}
