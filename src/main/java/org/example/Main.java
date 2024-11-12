package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,4,34,6,7,34,325,4123,424,632,4};
//        SortingAlgorithms.bubbleSort(arr);
//        SortingAlgorithms.selectionSort(arr);
//        SortingAlgorithms.insertionSort(arr);
//        SortingAlgorithms.quickSort(arr,0,arr.length-1);
        SortingAlgorithms.mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);


//        System.out.println(SearchingAlgorithms.linearSearch(arr,4));
//        System.out.println(SearchingAlgorithms.binarySearch(arr,424));
    }
}