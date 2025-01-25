package com.dsa.dsapractice.array;

/*
Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

Note: Elements of a[] and b[] are not necessarily distinct.

Examples

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
Output: 5
Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
Input: a[] = [85, 25, 1, 32, 54, 6], b[] = [85, 2]
Output: 7
Explanation: Union set of both the arrays will be 85, 25, 1, 32, 54, 6, and 2. So count is 7.
Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1]
Output: 2
Explanation: We need to consider only distinct. So count of elements in union set will be 2.
 */

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArraysWithDuplicates {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 1, 1, 2};
        int[] arr2 = {2, 2, 1, 2, 1, 3, 4};

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));

        unionOfArrayOne(arr1, arr2);
    }

    private static void unionOfArrayOne(int[] arr1, int[] arr2) {

        HashSet<Integer> union = new HashSet<>();

        for (int i : arr1) {
            union.add(i);
        }
        for (int i : arr2) {
            union.add(i);
        }

        System.out.println("Union of 2 Arrays: " + union.toString());
        System.out.println("Size of union: " + union.size());
    }
}
