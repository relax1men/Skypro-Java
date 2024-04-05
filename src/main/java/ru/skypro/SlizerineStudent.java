package ru.skypro;

public class SlizerineStudent extends HogwartsStudent {
    public int trick;
    private int determination;
    private int ambitiousness;
    private int resourcefulness;
    private int imperious;

    public SlizerineStudent(String name, int powerMagic, int transrgessionDistance, int trick,
                            int determination, int ambitiousness, int resourcefulness, int imperious) {
        super(name, powerMagic, transrgessionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.imperious = imperious;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getImperious() {
        return imperious;
    }

    public void setImperious(int imperious) {
        this.imperious = imperious;
    }

    @Override
    protected int sumOfCharacteristic() {
        return trick + determination + ambitiousness + resourcefulness + imperious;
    }

    public void compareTo(SlizerineStudent slizerineStudent) {
        compareToStudent(slizerineStudent);
    }

    @Override
    public String toString() {
        return super.toString()+ ", хитрость: %d, решительность: %d, амбициозность: %d, властность: %d".formatted(trick,
                determination, ambitiousness,resourcefulness, imperious);
    }
}