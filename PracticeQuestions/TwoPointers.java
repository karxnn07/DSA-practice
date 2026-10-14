// package PracticeQuestions;

public class TwoPointers {
    public static boolean twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                return true;
            } 
            else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 7, 6, 12, 9, 14};
        int target = 10;

        System.out.println(twoSum(arr, target));
    }
}