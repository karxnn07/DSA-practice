public class GCD {
    public static int findGCD() {
        int a = 18;
        int b = 12;

        while(b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return  a;
    }
    public static void main(String args[]) {
        System.out.println(findGCD());
    }
}