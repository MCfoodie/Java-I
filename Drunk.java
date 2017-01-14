/* Author: Ming-Chun Chen
   Date: Nov 12, 2016
   Program Name: Drunk.java
   Description: The program simulate one dimensional random walking until either reach home or jail.
*/

import java.lang.*;

public class Drunk{
    public static void main(String[] args){
        final int N = 5;                        //Number of simulation
        int totalSteps = 0;
        double avgSteps = 0.0;
        for(int i=0; i<N; i++){
            System.out.println("Here we go again... time for a walk!");
            totalSteps += drunkWalk();          //drunkWalk method returns number of steps to reach either home or jail for each simulation.
            avgSteps = (double) totalSteps/N;   //calculate the average.
        }
        System.out.printf("Average # of steps equals " + "%.1f", avgSteps); //print average step in one decimal.
        System.out.println();
    }
    
    static int drunkWalk(){         //Method drunkWalk returns # of steps student take to reach HOME or JAIL.
        int start = 6;              //This is where student begin walking.
        final int HOME = 1;         //HOME is located at 1st street. Constant that never changes.      
        final int JAIL = 11;        //JAIL is located at 11st street. Constant that never changes.
        int counter = 0;            //Initialize counter to remember the steps.
        while(!(start== HOME || start == JAIL)){    //If student never reacher HOME or JAIL, keep walking.
            start = start + direction();            //Student position changes at every corner.
            counter += 1;                           //Add steps at every corner.
        }
        if(start == 1){                             //Because of while loop, student will arrive at either 1 (HOME) or 11(JAIL) at this point.
            System.out.println("Took " + counter + " steps, and \nLanded in HOME");
        }
        else{
            System.out.println("Took " + counter + " steps, and \nLanded in JAIL");
        }
    return counter;                                 //Return steps.
    }
    
    static int direction(){                         //Method direction tells us whether turned left or right.
        if(Math.random()<0.5){                      //random number less than 0.5 tells the student to go left (toward HOME)
            int step = -1;
            return step;
        }
        else{                                       //Otherwise, go right (toware JAIL)
            int step = 1;
            return step;
        }
    }
}