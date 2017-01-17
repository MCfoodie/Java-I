/* Author: Ming-Chun Chen
   Date: Nov 29, 2016
   Program Name: PizzaParty.java
   Description: This PizzaParty java program tells user the type of pizza, its square inch, cost of one slice and cost per square inch.
*/

public class PizzaParty {
    //main method create two pizza objects and print each pizza information by calling printPizzaStats method.
    public static void main(String[] args){
        Pizza appetizer = new Pizza("Pepperoni", 16, 10.50, 10);                //create new pizza object call appetizer.
        Pizza mainCourse = new Pizza("Anchovy & Pineapple", 20, 11.95, 8);      //create new pizza object call mainCourse.
        printPizzaStats(appetizer);
        System.out.println();
        printPizzaStats(mainCourse);
    }

    //printPizzaStats method take object Pizza and calls the respective instance methods inside Pizza class.
    public static void printPizzaStats(Pizza p) {
        System.out.printf("Your %s pizza has %.2f square inches " + "per slice.\n",
                p.getName(),                                //name of the pizza returned by getName() instance method inside Pizza class.
                p.areaPerSlice());                          //area per slice calculated by instance method call areaPerSlice() inside Pizza class
        System.out.printf("One slice costs $%.2f, which comes" +
                          " to $%.3f per square inch.\n",
                          p.costPerSlice(),                 //cost per slice calculated by instance method call costPerSlice() inside Pizza class.
                          p.costPerSquareInch());           //cost per square inch calculated by instance method call costPerSquareInch() inside Pizza class.
    }
}
