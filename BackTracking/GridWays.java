package BackTracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // Base Case 
        if (i == n-1 && j== m-1) {
            return 1;
        }
        // Boundary Case
        if (i >= n || j>=m) {
            return 0;
        }
        // Move Right
        int Right = gridWays(i, j+1, n, m);
        // Move Down
        int Down = gridWays(i+1, j, n, m);
        return Right+Down;
    }
    public static void main(String args[]) {

        int n = 3; 
        int m = 4;
        int ways = gridWays(0, 0, n, m);
        System.out.println("Number of ways = " + ways);
    }
}