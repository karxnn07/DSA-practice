package Basics;
// Switch case statement:
// public class javabasics{
//         public static void main(String args[]){
//                 int number = 5;
//                 switch(number){
//                 case 1 : System.out.println("Samosa");
//                 break;
//                 case 2 : System.out.println("Burger");
//                 break;
//                 case 3 : System.out.println("Mango Shake");
//                 break;
//                 default : System.out.println("Wake up, it's just a dream.");
//                 }
//         }
// }

// Write a java program to input week number(1-7) and print the day of week name using switch case:
import java.util.*;
public class SwitchCase {

        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                switch (number){
                        case 1 : System.out.println("Monday");
                        break;
                        case 2 : System.out.println("Tuesaday");
                        break;
                        case 3 : System.out.println("Wednesday");
                        break;
                        case 4 : System.out.println("Thursday");
                        break;
                        case 5 : System.out.println("Friday");
                        break;
                        case 6 : System.out.println("Saturday");
                        break;
                        case 7 : System.out.println("sunday");
                        break;
                        default : System.out.println("Enter a valid number");
                }
                sc.close();
        }
}