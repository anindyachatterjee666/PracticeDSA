package com.dsa.dsapractice.array;

/*
Given an integer array arr[]. You need to find the maximum sum of a subarray.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray {-2} has the largest sum -2.
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
 */

public class KadaneAlgo_MaxSumOfSubArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};

//        int result = findMaxSumOfSubArrayOne(arr);
//        System.out.println("Max sum of SubArray: " + result);

        int result1 = findMaxSumOfSubArrayTwo(arr);
        System.out.println("Max sum of SubArray: " + result1);

    }

//    Kadane's Algo. Time Complexity -> O(N)
    private static int findMaxSumOfSubArrayTwo(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int j = 0;
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return currentSum;
    }

//    Time Complexity O(n^2)
    private static int findMaxSumOfSubArrayOne(int[] arr) {

        int maxSum = Integer.MIN_VALUE;  // Start with the smallest possible value

        // Traverse all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                // Add the current element to the current sum
                currentSum += arr[j];

                // Update the maxSum if the current sum is larger
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }
}
