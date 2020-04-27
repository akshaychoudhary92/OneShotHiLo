package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public void guessHiLo(){
        Random rand = new Random();

        int r = rand.nextInt(100);
//
//        for(int i = 0; i < 102; i++){
//            int r = rand.nextInt(100 + 1);
//            System.out.println(r);
//        }

        int input;

        Scanner s = new Scanner(System.in);
        System.out.println("Im thinking of a number between 1-100. Try to guess it.");
        input = s.nextInt();

        if(input == r){
            System.out.println("you guessed it! What are the odds!?!?");
        }else if(input > r){
            System.out.println("Sorry, you are too high. I was thinking " + r);
        }else if(input < r){
            System.out.println("Sorry, you are too low. I was thinking " + r);
        }else{
            System.out.println("error");
        }


    }
}
