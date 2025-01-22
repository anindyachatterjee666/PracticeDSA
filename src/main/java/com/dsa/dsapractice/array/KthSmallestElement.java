package com.dsa.dsapractice.array;

/*
Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.

Follow up: Don't solve it using the inbuilt sort function.

Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output:  7
Explanation: 3rd smallest element in the given array is 7.
Input: arr[] = [7, 10, 4, 20, 15], k = 4
Output:  15
Explanation: 4th smallest element in the given array is 15.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthSmallestElement {

    public static void main(String[] args) {

        int arr[] = {7, 10, 4, 20, 15};        // After Sorting -> [4, 7, 10, 15, 20]
        int k = 4;

//        int resultOne = findKthSmallestElementOne(arr, k);
//        System.out.println("Actual Array: " + Arrays.toString(arr));
//        System.out.println(String.format("%d-th smallest Element: %s", k, resultOne));

//        int resultTwo = findKthSmallestElementTwo(arr, k);
//        System.out.println("Actual Array: " + Arrays.toString(arr));
//        System.out.println(String.format("%d-th smallest Element: %s", k, resultTwo));

        int resultThree = findKthSmallestElementThree(arr, k);
        System.out.println("Actual Array: " + Arrays.toString(arr));
        System.out.println(String.format("%d-th smallest Element: %s", k, resultThree));

    }

//    Time Complexity-> O(nLog(n)), Create Max Heap
    private static int findKthSmallestElementThree(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    //    Java 8
    private static int findKthSmallestElementTwo(int[] arr, int k) {

        return Arrays.stream(arr)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array does not have enough elements"));

        //.forEach(e -> System.out.println( e + ", "));

//        return Arrays.stream(arr)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .skip(k-2)
//                .findFirst()
//                .get();

    }

    //    O(n^2)
    private static int findKthSmallestElementOne(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        return arr[k - 1];
    }
}
