package com.key.account.wordchecker;
import java.util.Scanner;

public class wordcheckertest {

    public static void main (String[] args){
        final int NUM_UPPER_LETTERS = 2;
        final int NUM_LOWER_LETTERS = 3;
        final int NUM_DIGITS = 1;

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password:");
        String input = in.nextLine();
        int inPutLength = input.length();

        for(int i=0; i<inPutLength;i++){
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if  (Character.isDigit(ch))
                digitCount++;
        }

        if(upperCount >= NUM_UPPER_LETTERS && lowerCount>= NUM_LOWER_LETTERS && digitCount >= NUM_DIGITS)
            System.out.println("Valid Password");
        else {
            System.out.println("The Password does not meet password Criteria!");
                if(upperCount < NUM_UPPER_LETTERS)
                    System.out.println("Password Must have 2 Upper Case Characters");
                if(lowerCount < NUM_LOWER_LETTERS)
                    System.out.println("Password Must have 3 Lower Case Characters");
                if(digitCount < NUM_DIGITS)
                    System.out.println("Password does not contain a numerical Character");
        }


    }

}
