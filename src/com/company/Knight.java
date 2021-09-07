package com.company;

public class Knight extends Hero{
    public Knight(int hp, int leve, int damage) {
        super(hp, leve, damage);
    }
    private int morePower;

    public void setMorePower(int morePower) {
        this.morePower = morePower;
    }

    public int getMorePower() {
        return morePower;
    }

    void knightInfo(){
        hp = 200;
        System.out.println("Oh my gosh, now my hp =" + hp + ". And now I hope we will win!");
    }
}
