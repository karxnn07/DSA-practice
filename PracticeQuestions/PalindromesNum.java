public class PalindromesNum {
    public static void isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        if(original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String args[]) {
        isPalindrome(122);
    }
}