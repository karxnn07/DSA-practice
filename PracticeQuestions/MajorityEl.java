// package PracticeQuestions;

import java.util.*;

public class MajorityEl {
    public static int majorityEl(int[] nums) {

// Approach 1:
//         Arrays.sort(nums);

//         int n = nums.length;
//         return nums[n/2];
//     }

// Approach 2:
    HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length/2;

        for (int word : nums) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for (int word : nums) {
            if (map.get(word) > n) {
                return word;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityEl(nums));
    }
}