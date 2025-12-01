package org.example.sortieralgorithmen;

public class IsSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6};

        boolean sorted = isSorted(array);
        System.out.println("Array ist sortiert: " + sorted);

        swap(array, 1, 3);
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        System.out.println(array[i] + " wurde getauscht mit  " + array[j]);
    }
}