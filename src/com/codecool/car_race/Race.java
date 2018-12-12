package com.codecool.car_race;

import java.util.Random;


public class Race {

    public void  simulateRace() {

    }

    public  void  printRaceResults(){
        if(setRaining()){
            System.err.println("It's raining!");
        }
        else{
            System.out.println("THe weather is clear");
        }

    }

    private boolean setRaining(){
        boolean rain = false;
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        if (n<=30){
            rain = true;
        }
        return rain;
    }

}
