package org.example.sortieralgorithmen;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 6, 2, 45, 4};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int num: array){
            System.out.print(num + ", ");
        }
    }
}
