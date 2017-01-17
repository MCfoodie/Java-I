/* Author: Ming-Chun Chen
   Date: Feb 14, 2016
   Program Name: RepeatedDigits.java
   Description: RepeatedDigits counts number of digits appears in a input number
*/

import java.util.*;
public class RepeatedDigits {
    public static void main(String[] args){
        int[] occurances = new int [10];                    //Declare array;
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};      //Initialize array; for printing purpose only. To make the output neat
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int inputNum = keyboard.nextInt();                  //read user input number
        String inputString = Integer.toString(inputNum);    //Convert integer to string
        for(int i=0; i<inputString.length();i++){           //Loop thru the length of char in string
            if(inputString.charAt(i)=='-'){                 //if there is minus sign, ignore
                continue;
            }
            char inputChar = inputString.charAt(i);         //convert each letter to character
            int count = Character.getNumericValue(inputChar);   //convert character to integer and store in count
            occurances[count] +=1;                              //base on value in count, increment respective index in occurances array by 1
        }
        
        System.out.print("Digit:       ");                  //Print Digit and number 0 to 9
        for(int i=0; i<digits.length; i++){
            System.out.print(digits[i] + "     ");
        }
        System.out.println("");
        System.out.print("Occurrences: ");                  //Print Occurrences and frequency of each number
        for(int i=0; i<occurances.length; i++){             
            System.out.print(occurances[i] + "     ");
        }
        System.out.println("");
    }
}
