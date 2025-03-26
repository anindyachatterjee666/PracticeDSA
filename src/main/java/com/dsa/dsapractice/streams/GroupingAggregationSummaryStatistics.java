package com.dsa.dsapractice.streams;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingAggregationSummaryStatistics {
    public static void main(String[] args) {


//        Problem- 1 -> Create Immutable List which allows NULL value.
        /*
        "var" -> This is a feature introduced in Java 10 that allows local variable type inference. The compiler automatically determines the type of the variable based on the assigned value. In this case, immutableList will have the type Stream<String> because the stream contains elements of type String.
        The use of var allows the code to be more concise but still strongly typed.
         */
        var immutableList = Stream.of("Red", "White", "Blue", null).toList(); // when we are using ".toList(), it will make the list as immutable. "
//        immutableList.add("Black"); // throw compile time Error.
//        immutableList.forEach(System.out::println);

//       Create Immutable Array.
        int[] arr = {8, 0, 1, 2, 3, 4};
        var immutablelist = Collections.unmodifiableList(Arrays.stream(arr).boxed().collect(Collectors.toList()));
//        immutablelist.add(13); // throw run time Error.
//        list.stream().forEach(System.out :: println);




//      Problem- 2 -> Create Modifiable List which allows NULL value.
        var modifiableList = Stream.of("Red", "White", "Blue", null).collect(Collectors.toList());
        modifiableList.add("Black");
        modifiableList.set(3, "Orange"); // update the value also
//        modifiableList.stream().forEach(System.out :: println);




//        Problem- 3 -> Grouping Products by category
        /*
        The record in Java, introduced in Java 14 as a preview feature and finalized in Java 16, is a special type of class designed to act as a data carrier or value object. It provides a concise way to declare classes whose main purpose is to hold immutable data.
        Unlike a regular class, a record automatically provides:
            A constructor to initialize the fields.
            Getters for all fields.
            toString(), equals(), and hashCode() methods.
            Immutability of the fields
         When to Use Records:
            DTOs (Data Transfer Objects): When you need to pass data around in your application.
            Value Objects: When you want to model immutable objects with data that doesn’t change.
            Data Aggregation: For representing grouped data, like the Product in your example.
         When Not to Use Records:
            If you need to extend the class (since records do not support inheritance).
            If your class needs complex behavior or mutable state (records are for immutable data).
            If you need to use custom setters or explicit mutability for the fields.
         */
        record Product(String name,
                       String category,
                       int price){};

        Stream<Product> products = Stream.of(
                new Product("Laptop", "Electronics", 1000),
                new Product("Sofa", "Furniture", 700),
                new Product("TV", "Electronics", 5000),
                new Product("Table", "Furniture", 1500),
                new Product("Lamp", "Home Decor", 500)
        );

//        Map<String, List<Product>> groupProductsByCategory =
//                products.collect(Collectors.groupingBy(Product::category));
//        System.out.println(groupProductsByCategory);
        // print the Map using EntrySet
//        for(Map.Entry<String, List<Product>> entry : groupProductsByCategory.entrySet()){
//            System.out.println(entry.getValue());
//        }


//        Problem- 3 -> Aggregation: Calculating total price of Products by category
//        Map<String, Integer> totalPriceByCategory = products.collect(Collectors.groupingBy(Product::category , Collectors.summingInt(Product :: price)));
//        System.out.println(totalPriceByCategory);


//        Problem- 4 -> Average of products by category
//        Map<String, Double> avgPriceByCategory = products.collect(Collectors.groupingBy(Product::category, Collectors.averagingInt(Product::price)));
//        System.out.println(avgPriceByCategory);


//        Problem- 5 -> Counting of products by category
        Map<String, Long> countProductsByCategory = products.collect(Collectors.groupingBy(Product::category, Collectors.counting()));
        System.out.println(countProductsByCategory);







    } // end main
}
