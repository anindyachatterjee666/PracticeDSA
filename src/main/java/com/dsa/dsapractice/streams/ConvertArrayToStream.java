package com.dsa.dsapractice.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToStream {
    public static void main(String[] args) {

//       Problem-1 ->  Converting Array[Primitive Type] into Streams
        int[] arrPrimitive = {1, 5, 2, 3, 4};
//        IntStream stream = Arrays.stream(arrPrimitive);
//        stream.forEach(System.out :: println);

//        Problem-2 ->  Converting Array[Object Type] into Streams
        Integer[] arrObjectType = {10, 9, 11, 15, 16};
        Stream<Integer> stream1 = Stream.of(arrObjectType);
        stream1.forEach(System.out :: println);

    }
}
