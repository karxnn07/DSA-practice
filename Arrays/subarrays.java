// print subarrays:
// public class Subarrays{
//     public static void printSubarrays(int numbers[]){
//         for (int i=0; i<numbers.length; i++){
//             int start = i;
//             for (int j=i; j<numbers.length; j++){
//                 int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(numbers[k] + " ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubarrays(numbers);
//     }
// }



// max subarray sum:
// public class maxsubArraysum{
    //     public static void maxSubarraySum(int numbers[]){
    //         int currSum = 0;
    //         int maxSum = Integer.MIN_VALUE;
    //         for (int i=0; i<numbers.length; i++){
    //             int start = i;
    //             for (int j=i; j<numbers.length; j++){
    //                 int end = j;
    //                 currSum = 0;
    //                 for (int k=start; k<=end; k++){
    //                     currSum+=numbers[k];
    //                 }
    //                 System.out.println(currSum);
    //                 if (currSum > maxSum){ 
    //                     maxSum = currSum;
    //                 }
    //             }
    //         }
    //         System.out.println("Max Sum = "+maxSum);
    //     }
    //     public static void main (String args[]) {
    //         int numbers[] = {2, 4, 6, 8};
    //         maxSubarraySum(numbers);
    //     }
    // }          

// max subArray sum by prefix array:
public class subarrays{
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];

        prefix[0] = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;

                currSum = start == 0? prefix[end] : prefix[end]-prefix[start-1];

                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
    }
}