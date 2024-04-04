package ru.skypro;

public class KogtevranStudent extends HogwartsStudent {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public KogtevranStudent(String name, int powerMagic, int transrgessionDistance, int mind, int wisdom,
                            int wit, int creativity) {
        super(name, powerMagic, transrgessionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    protected int sumOfCharacteristic() {
        return mind + wisdom + wit + creativity;
    }

    public void compareTo(KogtevranStudent kogtevranStudent) {
        compareToStudent(kogtevranStudent);
    }

    @Override
    public String toString() {
        return super.toString()+ " , ум: %d , мудрость: %d , остроумие: %d , творчесвто: %d".formatted(mind,wisdom,wit,creativity);
    }
}


