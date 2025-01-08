// Reverse Array

package com.dsa.dsapractice.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {5, 1, 10, -6, -1, 78};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] resultArrOne = reverseArrayOne(arr);
        System.out.println("Reverse Array: " + Arrays.toString(resultArrOne));
    }

//    O(N)
    private static int[] reverseArrayOne(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while(right > left){
            int t = 0;
            t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;

            left++;
            right--;
        }
        return arr;
    }

}
