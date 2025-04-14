package com.dsa.dsapractice.streams;

import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);

//        Traditional Approach -> Find sum of squares of even numbers
        int sum = 0;
        for(Integer num : numbers){
            if(num % 2 == 0){   // filter even numbers
                sum += num*num;    // square the number
            }
        }
        System.out.println("Sum(Traditional): " + sum);


//        Java Stream Approach -> Find sum of squares of even numbers
        int sumOfSquareStreams = numbers.stream()
                .filter(num -> num%2 == 0)
                .mapToInt(num -> num*num)
                .sum();
        System.out.println("Sum(Streams): " + sumOfSquareStreams);

    }
}
