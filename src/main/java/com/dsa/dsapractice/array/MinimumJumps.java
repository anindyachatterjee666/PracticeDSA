package com.dsa.dsapractice.array;

/*
You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

For example:

If arr[i] = 3, you can jump 1 step, 2 steps, or 3 steps forward from position i.
If arr[i] = 0, you cannot jump forward from that position.
Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.

Note:  Return -1 if you can't reach the end of the array.

Examples :

Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3
Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last.
Input: arr = [1, 4, 3, 2, 6, 7]
Output: 2
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
Input: arr = [0, 10, 20]
Output: -1
Explanation: We cannot go anywhere from the 1st element.
 */

public class MinimumJumps {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 6, 7};
        int num = findMinJumpsOne(arr);
        System.out.println("Num : " + num);

    }

    private static int findMinJumpsOne(int[] arr) {

        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        int maxReach = arr[0];  // Farthest index we can reach
        int steps = arr[0];     // Steps available from current position
        int jumps = 1;          // Number of jumps taken

        for (int i = 1; i < n; i++) {
            // If we've reached last index, return jumps
            if (i == n - 1) return jumps;

            // Update farthest reachable index
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use up a step
            steps--;

            // If no steps left
            if (steps == 0) {
                // Must make a jump
                jumps++;

                // Check if current index is beyond maxReach
                if (i >= maxReach) return -1;

                // Update steps to max possible jump from current position
                steps = maxReach - i;
            }
        }

        return -1;
    }
}
