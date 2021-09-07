package com.company;

public class Druid extends Healer{
    public Druid(int hp, int leve, int damage) {
        super(hp, leve, damage);
    }
    private  String animal;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    void tame(){
        System.out.println("Now, this animal is myyyyyyyy!");
    }

    @Override
    void healInfo() {
        System.out.println("Hello, My name is Slave, i am your Druid");
    }
}
