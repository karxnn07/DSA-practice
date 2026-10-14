// finding the largest number in the given array:
public class LargestNo{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for( int i=0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,4,5,7,9};
        System.out.println("Largest number in the given array is: " + getLargest(numbers));
    }
}
