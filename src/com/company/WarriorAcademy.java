package com.company;

public class WarriorAcademy extends Academy{
    @Override
    public void teach(Trainee trainee) {
        if(trainee instanceof Knight){
            super.teach(trainee);
        }
    }
}
