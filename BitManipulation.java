public class BitManipulation {
    public static void checkOddEven(int n) {
        int bitMask = 1;
        if ( (n & bitMask) == 0) {
            // Even
            System.out.println(n + " is an even Number");
        } else {
            // Odd
            System.out.println(n + " is an odd Number");
        }
    }

    // Get ith Bit:
    public static int getithBit(int n, int i) {
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set ith Bit:
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // Clear ith Bit:
    public static int clearIthBit(int n, int i) {
        int bitMask = ~ (1<<i);
        return n & bitMask;
    }

    // Update ith Bit:
    public static int updateIthBit(int n, int i, int NewBit) {
        if (NewBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
    //    System.out.println(5&6);
    //    System.out.println(5|6);
    //    System.out.println(5^6);
    //    System.out.println(~5);
    //    System.out.println(5<<2);
    //    System.out.println(5>>1);
    // checkOddEven(5);
    // System.out.println(getithBit(5, 100));
    // System.out.println(setIthBit(5, 1));
    // System.out.println(clearIthBit(10, 1));
    System.out.println(updateIthBit(10, 2, 1));
    }
}