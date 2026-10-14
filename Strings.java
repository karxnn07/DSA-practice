// import java.util.*;
// public class Strings {
//     // To print letters of a string
//     public static void printLetters(String str) {
//         for (int i=0; i<str.length(); i++) {
//             System.out.print(str.charAt(i) + "  ");
//         }
//         System.out.println();
//     }
//     // find the shortest path:
//     public static float shortestPath(String path) {
//         int x=0, y=0; 
//         for (int i=0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//             // South
//             if (dir == 'S') {
//                 y--;
//             }
//             else if (dir == 'N') {
//                 y++;
//             }
//             else if (dir == 'W') {
//                 x--;
//             }
//             else {
//                 x++;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float) Math.sqrt(X2+Y2);
//     }
//     public static void main(String args[]) {
//         // char arr[] = {'a', 'b', 'c', 'd'};
//         // String str = "abcd";
//         // String str2 = new String("xyz");

//         // // Input & Output
//         // Scanner sc = new Scanner(System.in);
//         // String name;
//         // name = sc.nextLine();
//         // System.out.println(name);

//         // Concatenation
//         String firstName = "Karan";
//         String lastName = "Singh";
//         String fullName = firstName + " " + lastName;
//         // System.out.println(fullName.charAt(8));

//         // printLetters(fullName);

//         String path = "WNEENESENNN";
//         System.out.println(shortestPath(path));
//     }
// }

// Print subarrays:
// public class Strings{
//     public static String subString(String str, int si, int ei) {
//         String substr = "" ;
//         for (int i=si; i<ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//     }
//     public static void main(String args[]) {
//         String str = "HelloWorld";
//         System.out.println(subString(str, 0, 5));
//     }
// }

// String Builder:
// public class Strings{
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("");
//         for (char ch='a'; ch<='z'; ch++) {
//             sb.append(ch);
//         }
//         System.out.println(sb);
//     }
// }

// For a given string, connect each of the first letter of each word to UpperCase:
// public class Strings{
//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for (int i=1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]) {
//         String str = "hi, i am karan.";
//         System.out.println(toUpperCase(str));
//     }
// }

// String Compression:
public class Strings{
    public static String compressString (String str) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++) {
        Integer Count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
            Count++;
            i++;
        }
        sb.append(str.charAt(i));
        if (Count>1) {
            sb.append(Count);
        }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "aaaabbccc";
        System.out.println(compressString(str)); 
    }
}