package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(100, 3, 30);
        Healer healer = new Healer(120, 2, 20);
        Knight knight = new Knight(130, 5, 40);
        Animal animal = new Animal("Dog", 20, 50);
        Druid druid = new Druid(130,3, 40);
        Sword sword = new Sword("Excalibur", 100);
        Saber saber = new Saber("Valide", 50);
        Cossack cossack = new Cossack(120,6, 150);

        hero.heroInfo();
        healer.healInfo();
        knight.knightInfo();
        cossack.heroInfo();
        druid.heroInfo();
        animal.animalAttack();
    }
}
