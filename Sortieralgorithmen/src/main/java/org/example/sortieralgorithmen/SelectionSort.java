package org.example.sortieralgorithmen;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 6, 8, 45, 9};


        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for (int num : array) {
            System.out.print(num + ", ");
        }
    }
}
