package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class AreaCalculator
{
    public static void main( String[] args )
    {
        //scanner class used to get user input
        Scanner keyboard = new Scanner(System.in); // create a scanner object

        System.out.println("Shape Area Calculator");

        while(true) {

            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=--=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();

            System.out.println("Please choose a Shape: ");

            int shape = keyboard.nextInt(); //Reads user number input
            System.out.println();

            if (shape == 1) {
                System.out.println("Base: ");
                int base = keyboard.nextInt();
                System.out.println("Height: ");
                int height = keyboard.nextInt();
                area_triangle(base, height);
            } else if (shape == 2){
                System.out.println("Length: ");
                int length = keyboard.nextInt();
                System.out.println("width: ");
                int width = keyboard.nextInt();
                area_rectangle(length, width);
            } else if (shape == 3) {
                System.out.println("Radius: ");
                int radius = keyboard.nextInt();
                area_circle(radius);
            } else if (shape == 4) {
                quit();
                break;
            }
        }
    }

    public static double area_triangle(int base, int height) {
        System.out.println();
        int A = (base * height) / 2;
        System.out.println("The area is " + A + ".");
        return A;
    }

   public static int area_rectangle(int length, int width) {
        System.out.println();
        int A = length * width;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static double area_circle(int radius) {
        System.out.println();
        double A = Math.PI * radius * radius;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static String quit() {
        System.out.println("Good Bye");
        return null;
    }
}
