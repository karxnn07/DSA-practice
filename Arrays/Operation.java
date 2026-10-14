// Operations in java:
import java.util.*;
public class Operation{
    public static void main(String args[]){
    // creating an array:
    int marks[] = new int[50];
    // input and output:
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("phy: "+marks[0]);
    System.out.println("chem: "+marks[1]);
    System.out.println("maths: "+marks[2]);
    // updating the array:
    marks[2] = marks[2]+1;
    System.out.println("maths: "+marks[2]);
    sc.close();
    }
}
