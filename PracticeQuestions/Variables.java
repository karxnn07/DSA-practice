// package PracticeQuestions;

import java.util.*;
public class Variables{
// Q. In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
    public static int average(int a, int b, int c) {
        
        int avg = (a+b+c)/3;
        return avg;
    }

// Q. Find the area of a square. take the sides as input:
    public static int areaOfSquare(int side) {
        int area = side * side;
        return area;
    } 

    // Calculate the cost of a pencil, pen and an eraser:
    public static float stationaryPrice(float pencilPrice, float penPrice, float eraserPrice) {
        float totPrice = (pencilPrice + penPrice + eraserPrice) * 18/100;
        return totPrice;
    }

    // calculate the result of the following:
    // byte b = 4, char c = 'a', short s = 512, int i = 1000, float f = 3.14f, double d = 99.9954
    // (f * b) + (i % c) - (d * s);

    public static void main(String args[]) {

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f; 
        double d = 99.9954;
        // int $ = 55;

        double calculate = (f * b) + (i % c) - (d * s);
        System.out.println(calculate);
        

        Scanner sc = new Scanner(System.in);

        // Average:
        // System.out.print("Enter the first number: " );
        // int a = sc.nextInt();

        // System.out.print("Enter the second number: " );
        // int b = sc.nextInt();

        // System.out.print("Enter the third number: " );
        // int c = sc.nextInt();

        // System.out.println("Average is: " + average(a, b, c));

        // Area:
        // System.out.print("Enter the side of the square: " );
        // int side = sc.nextInt();

        // System.out.println("Area of the square is : " + areaOfSquare(side));

        // Price:
        // System.out.print("Enter the price of the pencil : " );
        // float pencilPrice = sc.nextFloat();

        // System.out.print("Enter the price of a pen : " );
        // float penPrice = sc.nextFloat();

        // System.out.println("Enter the price of an eraser : " );
        // float eraserPrice = sc.nextFloat();

        // System.out.println("The cost of the stationary with gst is : " + stationaryPrice(pencilPrice, penPrice, eraserPrice));
        sc.close();
    }
}