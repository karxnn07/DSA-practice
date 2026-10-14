package Basics;
// public class functions{
//     public static void introduction(){
//         System.out.println("Heyy!! This is Karan Singh and i'm a BTech 3rd year student at subharti university.");
//         return;
//     }
//     public static void main(String args[]){
//         introduction();  //function called...
//     }
// }

// find sum of two numbers by given two parameters:
// import java.util.*;
// public class functions {
//     public static void printhelloWorld(){
//         System.out.println("Hello World");
//     }
//     public static int calculateSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("Sum is: "+sum);
//     }
// }

// swap two numbers:
// public class functions{
//     public static void swap(){
//         int a = 5;
//         int b = 10;

//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a ="+a);
//         System.out.println("b ="+b);
//     }
//     public static void main(String srgs[]){
//         swap();
//     }
// }

// Call by Value (Java always calls by value):
// public class functions{
//     public static void changeA(int a){
//         a = 10;
//     }
//     public static void main(String args[]){
//         int a = 5;
//         changeA(a);
//         System.out.println(a);
//     }
// }

// find the product of a and b:
// public class functions{
//     public static int multiply(int a, int b){
//         int product = a*b;
//         return product;
//     }
//     public static void main(String args[]){
//         int a =3;
//         int b =5;
//         int prod = multiply(a,b);
//         System.out.println("The product of a and b is:" +prod);
//     }
// }

// Find the factorial of a number:
// public class functions{
//     public static int factorial(int n){
//         int f = 1;

//         for(int i = 1; i <= n; i++){
//             f = f*i;
//         }
//         return f;
//     }
//     public static void main(String args[]){
//        System.out.println(factorial(5));
//     }
// }

// find the binomial coefficient:
// public class functions{
//     public static int factorial(int n){
//         int f = 1;

//         for( int i = 1; i <= n; i++){
//             f  = f*i;
//         }
//         return f;
//     }
//     public static int binCoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n/(fact_r*fact_nmr);
//         return binCoeff;
//     }
//     public static void main( String args[]){
//         System.out.println(binCoeff(7,2));
//     }
// }

// check if a number is prime or not(optimized);
// public class functions{
//     public static boolean isPrime(int n){
//         if (n == 2){
//             return true;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++){
//             if (n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         boolean isPrimeorNot = isPrime(8);
//         System.out.println(isPrimeorNot);
//     }
// }

// Print all the primes in range:
// public class functions{
//     public static boolean isPrime(int n){
//         if (n == 2){
//             return true;
//         }
//         for( int i = 2; i <= Math.sqrt(n); i++ ){
//             if( i % 2 == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void PrimesinRanges(int n){
//         for (int i = 2; i <= n; i++){
//             if (isPrime(i)){
//                 System.out.println(i+" ");
//             }
//         }
//     }
//     public static void main(String args[]){
//        PrimesinRanges(5);
//     }
// }

// Conversion of binary to decimal:
public class functions{
    public static void bintoDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while ( binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow)); //here,typecasting is used..

            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of myNum = " + decNum);
    }
    public static void main(String ars[]){
        bintoDec(101);
    }
}