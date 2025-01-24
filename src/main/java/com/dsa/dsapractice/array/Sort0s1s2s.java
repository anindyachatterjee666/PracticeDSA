package com.dsa.dsapractice.array;

/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

You need to solve this problem without utilizing the built-in sort function.

Examples:
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2
*/

import java.util.Arrays;

public class Sort0s1s2s {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 2, 2, 2, 1, 0, 0, 1, 2, 1, 2, 0, 0, 0, 1, 2, 2, 0, 1, 1, 1, 2, 0};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        int[] resultArr = sorting(arr);
        System.out.println("After Sorting: " + Arrays.toString(resultArr));
    }

    // Dutch National Flag algorithm (also known as 3-way partitioning). O(n) time complexity
    // O(1) space complexity
    private static int[] sorting(int[] arr) {

        int left = 0;
        int mid = 0;
        int right = arr.length - 1;

        while(mid <= right){
            switch(arr[mid]){
                case 0:
                    swap(arr, left, mid);
                    mid++;
                    left++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, right);
                    right--;
                   break;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
