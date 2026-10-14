public class PrimeInRange {
    public static void primeInRange() {
        
        for (int i=10; i<=30; i++) {
            boolean isPrime = true;

            for(int n=2; n<i; n++) {
                if(i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]) {
        primeInRange();
    }
}