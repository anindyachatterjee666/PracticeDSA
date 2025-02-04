package com.dsa.dsapractice.array;

/*
Array Duplicates

Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3]
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [0, 3, 1, 2]
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Input: arr[] = [2]
Output: []
Explanation: There is single element in the array. Therefore output is empty.
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 106
 */

import java.util.*;

public class ArrayDuplicates {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 3};
        System.out.println("Input Array: "+ Arrays.toString(arr));

//        List<Integer> resultOne = findArrayDuplicatesOne(arr);
//        System.out.println("Duplicates: "+ resultOne.toString());

        List<Integer> resultTwo = findArrayDuplicatesTwo(arr);
        System.out.println("Duplicates: "+ resultTwo.toString());
    }

//    SpaceComplexity -> O(k)
    private static List<Integer> findArrayDuplicatesTwo(int[] arr) {

        List<Integer> numList1 = new ArrayList<>();
        List<Integer> numList2 = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(!numList1.contains(arr[i])){
                numList1.add(arr[i]);
            }else{
                numList2.add(arr[i]);
            }
        }

        return numList2;
    }


//    O(n^2)
    private static List<Integer> findArrayDuplicatesOne(int[] arr) {

        int index = 0;
        List<Integer> resultList = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            index = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    index++;
                }
                if (index >= 2) {
                    resultList.add(arr[i]);
                    break;
                }
            }
        }

        return resultList;
    }
}
