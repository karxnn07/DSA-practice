// print pairs;
public class PairsInArray{
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs=" + tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        for(int i=0; i<numbers.length; i++){
           System.out.print(numbers[i] + " ");
         }
         System.out.println();
        printPairs(numbers);
    }
}