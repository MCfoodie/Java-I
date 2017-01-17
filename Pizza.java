/* Author: Ming-Chun Chen
   Date: Nov 29, 2016
   Program Name: Pizza.java
   Description: This Pizza class contains instance methods that returns type of pizza, its square inch, cost of one slice and cost per square inch.
*/

import java.math.*;
class Pizza {
    //create private instance variables
    private String name;
    private int radius;
    private double cost;
    private int slices;

    //Constructor named Pizza that takes 4 arguments. Type of pizza, diameter, cost and slices
    public Pizza(String pizzaType, int pizzaDiameter, double pizzaCost, int pizzaSlices){
        name = pizzaType;
        radius = pizzaDiameter/2;       //calculate radius for area of pizza calculation.
        cost = pizzaCost;
        slices = pizzaSlices;
    }

    //instance method that retuns pizza type
    public String getName(){
        return name;
    }

    //instance method that calculates area per slice.
    public double areaPerSlice(){
        double areaPerSlice = (Math.PI * radius * radius)/slices;
        return areaPerSlice;
    }

    //instance method that calculates cost per slice.
    public double costPerSlice(){
        double costPerSlice = cost/slices;
        return costPerSlice;
    }

    //instance method that calculates cost per square inch of pizza.
    public double costPerSquareInch(){
        return costPerSlice()/areaPerSlice();
    }
}
