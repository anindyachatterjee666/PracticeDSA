package com.dsa.dsapractice.array;

/*
Given an array arr, rotate the array by one position in clockwise direction.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
 */

import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
//        int[] arr1 = shiftArrayByOne(arr);

        int[] arr2 = shiftArrayByOneUsingTwoPointersAlgo(arr);
    }

    //    using 2 pointer's algo
    private static int[] shiftArrayByOneUsingTwoPointersAlgo(int[] arr) {

        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }

    //    Shifting Each Element – O(n) Time and O(1) Space
    private static int[] shiftArrayByOne(int[] arr) {

        int value = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
