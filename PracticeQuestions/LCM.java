public class LCM {
    public static int findLCM() {
        int a = 12, b = 18;
        int LCM = Math.max(a, b);

        while(true) {
            if (LCM % a == 0 && LCM % b == 0) {
            return LCM;
            }
            LCM++;
        }
    }
    public static void main(String args[]) {
        System.out.println(findLCM());
    }
}