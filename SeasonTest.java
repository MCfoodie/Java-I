/* Author: Ming-Chun Chen
   Date: Nov 29, 2016
   Program Name: SeasonTest.java
   Description: This SeasonTest java program returns season given month and day.
*/

import java.util.*;
public class SeasonTest {
    //main method take user input and prints season.
    public static void main(String[] args) {
        System.out.println("Please enter the month and the date ");
        Scanner keyboard = new Scanner(System.in);
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();
        System.out.println(season(month, day));
    }
    
    //season method returns String type season given month and day
    static String season(int month, int day) {
        if (checkDate(month, day)) {                    //if month and day supplied is a valid date
            int monthPlusDay = month * 100 + day;       //use month and day to construct a range
            if(monthPlusDay <= 315){                    //jan 1st to march 15 is winter
                return "winter";
            }
            else if(monthPlusDay <= 615){               //march 16 to jun 15 is spring
                return "spring";
            }
            else if(monthPlusDay <= 915){               //jun 16 to sep 15 is summer
                return "summer";
            }
            else if(monthPlusDay <= 1215){              //sep 16 to dec 15 is fall
                return "fall";
            }
            else{                                       //dec 16 to dec 31 is also winter
                return "winter";
            }
        } else {
            return "Impossible";                        //if date is invalid, return impossible.
        }
    }

    //checkDate check whether the input date is valid or invalid. true/false
    static boolean checkDate(int month, int day){
        if(month < 1 || month > 12){
            return false;
        }
        else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day<1 || day>31)){
            return false;
        }
        else if(month == 2 && (day < 1 || day > 28)){
            return false;
        }
        else if((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)){
            return false;
        }
        else{
            return true;
        }
    }
}
