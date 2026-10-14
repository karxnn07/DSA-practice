public class PowerOfaNum {
    public static void main(String args[]) {
        int n = 2;
        int pow = -2;
        int result = 1;

        for(int i=1; i<=pow; i++) {
            result = result * n;
        }
        System.out.println(result);
    }
}