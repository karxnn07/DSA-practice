// package PracticeQuestions;

import java.util.*;

public class FindMissindAndRepeatingno {
    public static int[] findMissindAndRepeatingno(int[][] grid) {
        int n = grid.length;
        int total = n*n;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {

                int num = grid[i][j]; 

                if (map.containsKey(num)) {
                    map.put(num, map.get(num) +1);
                } else {
                    map.put(num, 1);
                }
            }
        }
        int repeating = -1;
        int missing = -1;

        // check numbers from 1 to n^2:
        for(int num=1; num<=total; num++) {
            if(map.containsKey(num)) {
                if(map.get(num) == 2) {
                    repeating = num;
                }
            } else {
                missing = num;
            }
        }
        return new int[]{repeating, missing};
    }

    public static void main(String args[]) {
        int grid[][] = {{1,3}, {2,2}};
        int[] ans = findMissindAndRepeatingno(grid);

        System.out.println("Repeating = "+ans[0]);
        System.out.println("Missing = "+ans[1]);
    }
}