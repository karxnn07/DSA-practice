class SumOfDigits {
    public static int sum(int n) {
        int sum = 0;
        while(n != 0) {
            int Digits = n % 10;
            n = n / 10;
            sum += Digits;
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(sum(123));
    }
}