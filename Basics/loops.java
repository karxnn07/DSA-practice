package Basics;
// Print Hello world for 100 times:
// public class Loops {
//     public static void main(String args[]){
//         int counter = 0;
//         while( counter < 100 ){
//             System.out.println("Hello World");
//             counter ++;
//         }
//     }
// }

// Print numbers from 1 to 10 using while loop:
// public class Loops{
//     public static void main(String args[]){
//         int counter = 1;
//         while( counter <= 10 ){
//             System.out.println(counter);
//             counter ++;
//         }
//     }
// }

// Print numbers from 1 to n:
// import java.util.*;
// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int counter = 1;
//         int range = sc.nextInt();
//         while( counter <= range ){
//             System.out.println(counter);
//             counter ++;
//         }

//     }
// }

// Print the sum of n natural numbers:
// import java.util.*;
// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while( i <= n ){
//             sum +=i;
//             i++;
//         }
//         System.out.println("Sum of the given numbers is: " + sum );
//     }

// }

// FOR LOOPS:
// Print hello world for 10 times using for loop:
// public class Loops {
//     public static void main (String args[]) {
//         for ( int i = 1; i <= 10; i++ ) {
//             System.out.println("Hello World!");
//         }
//     }
// }

// print square pattern USING FOR LOOP:
// ****
// ****
// ****
// ****
// public class Loops {
//     public static void main( String args [] ) {
//         for ( int line = 1; line <= 4; line ++) {
//             System.out.println("****");
//         }
//     }

    
// }

// print square pattern USING WHILE LOOP:
// ****
// ****
// ****
// ****
// public class Loops {

//     public static void main(String args[]){
//         int line = 1;
//         while (line <= 4) {
//             System.out.println("****");
//             line++;
//         }
//     }
// }

// Print reverse of a number:
// public class Loops{
//     public static void main(String args[]){
//         int n = 10899;
//         while(n > 0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n/10;
//         }
//     }
// }

// Print reverse of a given number:
// import java.util.*;

// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(n > 0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n/10;
//         }
//     }
// }

// Do While loop:
// Print Hello World for 10 times:
// public class loop{
//     public static void main(String args[]){
//         int counter = 1;
//         do {
//             System.out.println("Hello World");
//             counter++;
//         }while(counter <= 10);
//     }
// }

// break statement:
// public class loop {

//     public static void main(String args[]){
//         for (int i =1; i <= 5; i++){
//             if (i == 4) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I'm out of the loop" );
//     }
// }

// Kepp entering numbers user enters a multiple of 10:
// import java.util.*;
// public class loop {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do{
//             int n = sc.nextInt();
//             if (n%10 == 0){
//                 break;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

// Continue statement:
// public class loop {

//     public static void main(String[] args) {
//         for(int i = 0; i <= 5; i++) {
//             if (i == 3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// Display all the numbers displayed by user except the multiples of 10:
// import java.util.*;
// public class loop {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.println("Enter Your Number: " );
//             int n = sc.nextInt();
//             if (n % 10 == 0){
//                 continue;
//             }
//             System.out.println("Number was " + n);
//         } while(true);
//     }
// }

// Check if a number is prime or not:
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n == 2){
//             System.out.println(n + " is a prime number.");
//         } else {
//             boolean isPrime = true;

//             for( int i = 2;i <= n-1;i++){
//                 if (n % i == 0){
//                     isPrime = false;
//                 }
//             }
//             if (isPrime){
//                 System.out.println(n +" is a prime number.");
//             } else{
//                 System.out.println(n +" is not a prime number.");
//             }
//         }
//     }
// }