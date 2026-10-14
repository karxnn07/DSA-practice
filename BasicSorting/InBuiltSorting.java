import java.util.Arrays;

// public class InbuiltSort {
//     public static void inbuiltArraySort(int arr[]) {
//             Arrays.sort(arr);
//         }
//     public static void printArr(int arr[]) {
//         for (int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
//         inbuiltArraySort(arr);
//         printArr(arr);
//     }
// }

// To reverse an array:
import java.util.Collections;

public class InBuiltSorting {
    public static void inbuiltArrayReverse(Integer arr[]) {
        Arrays.sort(arr,Collections.reverseOrder());
    }
    public static void printArr(Integer arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
         Integer arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        inbuiltArrayReverse(arr);
        printArr(arr);
    }
}