package com.company;

public class Healer extends Hero{
    public Healer(int hp, int leve, int damage) {
        super(hp, leve, damage);
    }
    private int powerOfHeal;

    public void setPowerOfHeal(int powerOfHeal) {
        this.powerOfHeal = powerOfHeal;
    }

    public int getPowerOfHeal() {
        return powerOfHeal;
    }
    void healInfo(){
        System.out.println("Alright, i will heal u");
    }
}
