package Basics;
// Check if a student will pass or fail using ternay operator:
public class Ternary{
        public static void main(String args[]){
                int marks = 67;
                String reportCard = marks >= 33 ? "PASS" : "FAIL";
                System.out.println(reportCard);
        }
}