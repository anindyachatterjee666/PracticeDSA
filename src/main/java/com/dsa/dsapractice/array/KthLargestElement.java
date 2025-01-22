package com.dsa.dsapractice.array;

import java.util.PriorityQueue;

/*
Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth largest element in the given array. It is given that all array elements are distinct.

Follow up: Don't solve it using the inbuilt sort function.

Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3,    after sorting -> [20, 15, 10, 7, 4, 3]
Output:  10
Explanation: 3rd largest element in the given array is 10.
Input: arr[] = [7, 10, 4, 20, 15], k = 4,       after sorting -> [20, 15, 10, 7, 4]
Output:  7
Explanation: 4th largest element in the given array is 7.
 */
public class KthLargestElement {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;

        int restultOne = findKthlargestElementOne(arr, k);
        System.out.println(restultOne);

    }

//  Time Complexity -> O(nlog(n)), Create Min Heap
    private static int findKthlargestElementOne(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
    }
}
