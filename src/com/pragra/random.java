package com.pragra;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int thoughtNumber = (int)(Math.random()*10);
        System.out.println(thoughtNumber);
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        while (true) {
            int guessedNumber = sc.nextInt();
            if (thoughtNumber == guessedNumber) {
                System.out.println("you guessed the right number");
                break;
            } else {
                System.out.println("you guessed wrong");
            }

        }
        System.out.println("thank you 1");
        System.out.println("Bye");
        System.out.println("remo is beautiful");
    }
}

