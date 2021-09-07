package com.company;

public class Cossack extends Knight{
    public Cossack(int hp, int leve, int damage) {
        super(hp, leve, damage);
    }
    private Saber saber;

    public Saber getSaber() {
        return saber;
    }

    public void setSaber(Saber saber) {
        this.saber = saber;
    }

    @Override
    void heroInfo() {
        System.out.println("Hello! My name is Roman and I will die for your money.");
    }
}
