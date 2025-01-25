package com.dsa.dsapractice.array;

/*
Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.

Examples:

Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1]
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 */


import java.sql.Array;
import java.util.Arrays;

public class MoveAllNegativeElementsToEnd {

    public static void main(String[] args) {

        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        System.out.println("Input Array: " + Arrays.toString(arr));
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));

//        int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};
//        rearrange(arr2);
//        System.out.println("Rearranged array: " + Arrays.toString(arr2));

    }

    public static void rearrange(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for(int num : arr){
            if(num > 0)
                temp[index++] = num;
        }
        for(int num : arr){
            if(num < 0){
                temp[index++] = num;
            }
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
