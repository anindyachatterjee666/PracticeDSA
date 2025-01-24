package com.dsa.dsapractice.array;

/*
Given an array arr[] containing only 0s & 1s. Sort the array in ascending order.

You need to solve this problem without utilizing the built-in sort function.

Examples:
Input: arr[] = [0, 1, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1, 1]
Explanation: 0s 1s and 2s are segregated into ascending order.

Input: arr[] = [0, 1, 1, 0, 1, 1, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation: 0s 1s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2
*/

import java.util.Arrays;

public class Sort0s1s {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        int[] resultArr = sorting0s1s(arr);
        System.out.println("After Sorting: " + Arrays.toString(resultArr));
    }

//    2 pointers algorithm
    private static int[] sorting0s1s(int[] arr) {

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] == 0){
                left++;
            } else if (arr[right] == 1) {
                right--;
            }else{
                swap(arr, left, right);
                left++;
                right--;
            }
            }
        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
