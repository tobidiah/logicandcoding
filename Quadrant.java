/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Come down to the front with your x-coordinate");  //prompt the user for an x-coordinate
        //your x variable = keys.nextDouble();
        x = keys.nextDouble();
        System.out.println("Finally, some good food. Now give me that y-coordinate too");  //prompt the user for a y-coordinate
        //your y variable = keys.nextDouble();
        y = keys.nextDouble();
        keys.close();
        
        //determine the quadrant in which the user's order pair lies
        if (x>0 && y>0) {
            System.out.println("Your point is in quadrant 1");
        }
        else if (x<0 && y>0) {
            System.out.println("Your point is in quadrant 2");
        }
        else if (x<0 && y<0) {
            System.out.println("Yor point is in quadrant 3");
        }
        else if (x>0 && y<0) {
            System.out.println("Your point is in quadrant 4");
        }
            
        
        //output the result to the user
        System.out.println("Make your way up to the balcony");
    }
}