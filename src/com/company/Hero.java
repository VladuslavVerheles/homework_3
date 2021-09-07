package com.company;

public class Hero {
    int hp;
    private int leve;
    private int damage;

    public Hero(int hp, int leve, int damage){
        this.hp = hp;
        this.leve = leve;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getLeve() {
        return leve;
    }

    public int getHp() {
        return hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLeve(int leve) {
        this.leve = leve;
    }
    void heroInfo(){
        System.out.println("Hello, my friend. I will help u");
    }
}
