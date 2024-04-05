package ru.skypro;

public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String name, int powerMagic, int transrgessionDistance, int nobility, int honor, int bravery) {
        super(name, powerMagic, transrgessionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    protected int sumOfCharacteristic() {
        return nobility + honor + bravery;
    }

    public void compareTo(GriffindorStudent griffindorStudent) {
        compareToStudent(griffindorStudent);
    }

    @Override
    public String toString() {
        return super.toString() + " , благородство: %d  , честь: %d   , храбрость: %d".formatted(nobility, honor, bravery);
    }
}

