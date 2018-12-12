package com.codecool.car_race;

import java.util.*;


public class Race {

    public void  simulateRace() {

    }

    public  void  printRaceResults(){
        if(isRaining()){
            System.err.println("It's raining!");
        }
        else{
            System.out.println("The weather is clear");
        }

    }

    private int setRaining(){
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        return n;
    }
    private boolean isRaining(){
        return (setRaining()<=30);
    }

}
