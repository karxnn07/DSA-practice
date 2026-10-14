class Armstrong {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int count = 0;

        // count number of digits
        while (n != 0) {
            count++;
            n = n / 10;
        }
        // restore the original value
        n = original;

        // calculate sum of digits raised to the power of count
        while (n != 0) {
            int lastDigit = n % 10;
            sum += (int) Math.pow(lastDigit, count);
            n = n / 10;
        }
        // check armstrong
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        if (isArmstrong(153)) {
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}