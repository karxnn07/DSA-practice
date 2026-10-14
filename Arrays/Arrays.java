// 2D-ARRAYS:

// import java.util.*;
// public class Arrays {
//     public static boolean search(int matrix[][], int key) {
//         for (int i=0; i<matrix.length; i++) {
//             for (int j=0; j<matrix[0].length; j++){
//                 if (matrix[i][j] == key) {
//                     System.out.println("Key Found at index :" + "(" + i + "," + j + ")" );
//                     return true; 
//                 }
//             }
//         }
//         System.out.println("Key Not Found");
//         return false;
//     }
//     public static void main(String args[]) {
//         int matrix [][] = new int [3][3];
//         int n=3, m=3;
//         // input:
//         Scanner sc = new Scanner (System.in);
//         for (int i=0; i<n; i++) {
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         // output:
//         for (int i=0; i<n; i++) {
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//          System.out.println();
//         }
//         sc.close();
//         search(matrix, 9);
//     }
// }

// Spiral Matrix:
// public class Arrays{
//     public static void printMatrix(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;
        
//         while(startRow <= endRow && startCol <= endCol) {

//             // Top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // Right
//             for (int i = startRow+1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // Bottom
//             for (int j = endCol-1; j >= startCol; j--) {
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             // Left
//             for (int i = endRow-1; i >= startCol+1; i--) {
//                 System.out.print(matrix[i][startCol] +" ");
//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int matrix[] [] = {{1, 2, 3, 4},
//                             {5, 6, 7, 8},
//                             {9, 10, 11, 12},
//                             {13, 14, 15, 16}};
//                             printMatrix(matrix);
//     }
// }

// Diagonal sum:
// public class Arrays {
//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;
//         // for(int i=0; i<matrix.length; i++) {
//         //     for(int j=0; j<matrix[0].length; j++) {
//         //         if (i==j) {
//         //             sum += matrix[i][j];
//         //         }
//         //         else if (i+j == matrix.length-1) {
//         //             sum += matrix[i][j];
//         //         }
//         //     } 
//         // }
//         for (int i=0; i<=matrix.length-1; i++) {
//             // primary diagonal:
//             sum+= matrix[i][i];
//             // secondary diagonal:
//             if ( i != matrix.length-1-i)
//             sum+= matrix[i][matrix.length-1-i]; //This method has less time complexity than the earlier one.
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int matrix[] [] = {{1, 2, 3, 4},
//                             {5, 6, 7, 8},
//                             {9, 10, 11, 12},
//                             {13, 14, 15, 16}};
//                             System.out.print(diagonalSum(matrix));
//     }
// }

// Staircase Search in a 2D Matrix:
public class Arrays{
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if (matrix[row][col] == key) {
                System.out.println("Found the key at ("+ row +"," + col + ")");
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!!");
        return false; 
    }
    public static void main (String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
        int key = 100;
        staircaseSearch(matrix, key);
    }
}