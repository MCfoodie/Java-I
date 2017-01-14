/* Author: Ming-Chun Chen
   Date: Nov 12, 2016
   Program Name: Guess.java
   Description: The program guesses secret number using binary search algorithm.
*/

import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        int minNum = 1;                 //Guess must fall between minimum number 1 and maximum number 100.
        int maxNum = 100;               
        int counter = 1;                //start counting at 1 because computer will always make the first guess.
        Scanner keyboard = new Scanner(System.in);
        int guessNum = (minNum + maxNum)/2;         //First guess is mid point between min and max. 101/2 = int 50.
        System.out.println("is it "+ guessNum + "?");
        String strAnswer = keyboard.nextLine();        //Ask for user answer.
        char chrAnswer = strAnswer.charAt(0);           //index first Character of a String.
        while(chrAnswer != 'c'){                        //Until user say correct 'c'
            if(chrAnswer == 'b'){                       //If user says number is too big
                maxNum = guessNum - 1;                  //previous guess become new max number. -1 to exclude max number in next guess
                guessNum = (minNum + maxNum)/2;         //new guess number is between new max and min (this min could have changed depending on whether user said the number is too small in the previous iterations.) 
                System.out.println("is it " + guessNum + "?");
                counter ++;                             //Put inside if statement to avoid counting bogus user inputs.
            }
            if(chrAnswer == 's'){                       //If user stays number is too small
                minNum = guessNum + 1;                  //previous guess become new min number. +1 to exclude min number in next guess
                guessNum = (minNum + maxNum)/2;         //new guess number is between new min and max (this max could have changed depending on whether user said the number is too big in the previous iterations.
                System.out.println("is it "+ guessNum + "?");
                counter ++;                             //Put inside if statement to avoid counting bogus user inputs.
            }
            strAnswer = keyboard.nextLine();            //Always ask user input until user say the guess is correct.
            chrAnswer = strAnswer.charAt(0);
        }
        System.out.println("I got it after making just " + counter + " guesses.");
    }
}