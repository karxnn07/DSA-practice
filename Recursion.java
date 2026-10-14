public class Recursion {
 // To print Decresing order numbers:
   public static void printDec(int n) {
    if (n == 1) {
        System.out.print(n);
        return;
    }
    System.out.print(n+ " ");
    printDec(n-1);
   } 

// To print Increasing order numbers:
   public static void printInc(int n) {
    if (n == 1) {
        System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    printInc(n-1);
   }

//    To print sum of n natural numbers:
public static int calcSum(int n) {
    if (n == 1) {
        return 1;
    }
    int Snm1 = calcSum(n-1);
    int Sn = Snm1 + n;
    return Sn;
}

// To print nth fibonacci numbers:
public static int fibonacci(int n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
}

// Check if given array is sorted or not:
public static boolean isSorted(int arr[], int i) {
    if (i == arr.length-1) {
        return true;
    }
    if (arr[i] > arr[i+1]) {
        return false;
    }
    return isSorted(arr, i+1);
}

// To find the first occurance of an element in an array:
public static int firstOccurance(int arr[], int key, int i) {
    if (i == arr.length) {
        return -1;
    }
    if (arr[i] == key) {
        return i;
    }

    return firstOccurance(arr, key, i+1);
}

// To find the last occurance of an element in an array:
public static int lastOccurance(int arr[], int key, int i) {
    if (i == arr.length) {
        return -1;
    }
    int isFound = lastOccurance(arr, key, i+1);
    if (isFound != -1 ) {
        return isFound;
    }
    if (arr[i] == key) {
        return i;
    }
    return isFound;
}

// To print x^n:
public static int power(int x, int n) {
    if (n == 0) {
        return 1;
    }
    // int xnm1 = power(x, n);
    // int xn = x * xnm1;
    // return xn;
    return x * power(x, n-1);
}

// To print x^n (optimized):
public static int optimizedPower(int x, int n) {
    if (n == 0) {
        return 1;
    }
    int halfPower = optimizedPower(x, n/2);
    int halfPowerSq = halfPower *halfPower;
    if (n % 2 != 0) {
        return x * halfPowerSq;
    }
    return halfPowerSq;
}

// Tiling problem:
public static int tilingProblem(int n) {  // 2*n = floor size
    // base case
    if (n == 0 || n == 1) {
        return 1;
    }
    // vertical choice
    int fnm1 = tilingProblem(n-1);
    // horizontol choice 
    int fnm2 = tilingProblem(n-2);

    int totWays = fnm1 + fnm2;
    return totWays;
}

// To remove duplicates from the given string:
public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {

    // Base Case
    if (idx == str.length()) {
        System.out.println(newStr);
        return;
    }

    char currChar = str.charAt(idx);

    if (map[currChar - 'a']) {
        // duplicate
        removeDuplicates(str, idx + 1, newStr, map);
    } else {
        map[currChar - 'a'] = true;
        newStr.append(currChar);
        removeDuplicates(str, idx + 1, newStr, map);
    }
}

// Friens pairing problem:
public static int friendsPairing(int n) {
    if (n == 1 || n == 2) {
        return n;
    }
    // // single
    // int fnm1 = friendsPairing(n-1);
    // // pair
    // int fnm2 = friendsPairing(n-2);
    // int pairWays = (n-1) * fnm2;
    // // totWays
    // int totWays = fnm1 + pairWays;
    // return totWays;

    return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
}

// Binary Strings problem
public static void printBinaryStrings(int n, int lastPlace, String str) {

    // Base Case
    if (n == 0) {
        System.out.println(str);
        return;
    }

    // Place 0
    printBinaryStrings(n - 1, 0, str + "0");

    // Place 1 only if previous was 0
    if (lastPlace == 0) {
        printBinaryStrings(n - 1, 1, str + "1");
    }
}
   public static void main(String args[]) {
    // int n = 5;
    // printDec(n);
    // printInc(n);
    // System.out.println(calcSum(n));
    // System.out.println(fibonacci(n));
    // int arr[] = {1, 2, 3, 4 ,5};
    // System.out.println(isSorted(arr, 0));
    // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
    // System.out.println(firstOccurance(arr, 5, 0));
    // System.out.println(lastOccurance(arr, 5, 0));
    // System.out.println(power(7, 2));
    // System.out.println(optimizedPower(02, 10));
    // System.out.println(tilingProblem(3));
    // String str = "karansinghhh";
    // removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    System.out.println(friendsPairing(5));
   }
}