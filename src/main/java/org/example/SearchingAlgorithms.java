package org.example;

public class SearchingAlgorithms {
    static int linearSearch(int[] arr,int target)
    {
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
