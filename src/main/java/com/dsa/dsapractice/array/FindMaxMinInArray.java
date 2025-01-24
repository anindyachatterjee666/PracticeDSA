package com.dsa.dsapractice.array;

/*
Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

Examples:

Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
Input: arr[] = [1, 345, 234, 21, 56789]
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
Input: arr[] = [56789]
Output: 56789 56789
Explanation: Since the array contains only one element so both min & max are same.
Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <=109
 */

import lombok.Data;

import java.util.Objects;

@Data
class Pair<K, V>{

    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class FindMaxMinInArray {

    private static Pair findMaxMin(int[] arr) {

        // empty array handling
        if(arr.length == 0){
            return null;
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {

        int[] arr = {12, -2, 234, 21, 789};
        Pair pair = findMaxMin(arr);
        System.out.println(String.format("Min: %s, Max: %s", pair.getFirst(), pair.getSecond()));
    }
}
