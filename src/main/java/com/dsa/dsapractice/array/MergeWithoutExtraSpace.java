package com.dsa.dsapractice.array;

/*
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output:
1 2 3 5 8 9
10 13 15 20
Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.
Input: a[] = [0, 1], b[] = [2, 3]
Output:
0 1
2 3
Explanation: After merging two sorted arrays we get 0 1 2 3.
Constraints:
1 <= a.size(), b.size() <= 105
0 <= a[i], b[i] <= 107
 */

import java.lang.reflect.Array;
import java.util.*;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {

        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};

        mergeArraysOne(a, b);
    }

    public static void mergeArraysOne(int a[], int b[]) {

        List<Integer> mergeList = new ArrayList<>();

        for(int i : a){
            mergeList.add(i);
        }
        for(int i : b){
            mergeList.add(i);
        }

        Collections.sort(mergeList);
//        mergeList.sort(Comparator.naturalOrder());

        for(int i=0; i<a.length; i++){
            a[i] = mergeList.get(i);
        }

        for(int i=a.length, j=0; i< mergeList.size(); i++, j++){
            b[j] = mergeList.get(i);
        }
        System.out.println(mergeList.toString());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

