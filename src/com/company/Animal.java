package com.company;

public class Animal {
    private String name;
    private int hp;
    private int damage;

    public Animal(String name, int hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    final void animalAttack(){
        System.out.println("Now, I am the power! And u will all die!");
    }
}
