package org.example.sortieralgorithmen;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SortingAlgorithms {

    public static long[] GenerateRandomNumbers(int numbers, long limit)
    {
        long daten[];
        daten = new long [numbers];
        Random zuffi = new Random();
        for(int i = 0; i < daten.length; i++)
        {
            daten[i] = zuffi.nextLong(limit);
        }
        return daten;
    }

    public static boolean isArraySorted(long daten[])
    {
        for(int i = 0; i < daten.length-1; i++){
            if(daten[i] > daten[i+1]){
                return false;
            }
        }
        return true;
    }

    private static void swap(long daten[], int i, int k)
    {
        long temp = daten[i];
        daten[i] = daten[k];
        daten[k] = temp;
    }

    public static void bubbleSort(long daten [])
    {
        for(int i = 0; i < daten.length-1; i++){
            for(int k = 0; k < daten.length-i-1; k++){
                if(daten[i] > daten[k]){
                    swap(daten, i, k);
                }
            }
        }
    }

    public static void selectionSort(long daten [])
    {
        for(int i = 0; i < daten.length-1; i++){
            int minIndex = i;
            for(int k = i+1; k < daten.length; k++){
                if(daten[k] > daten[minIndex]){
                    minIndex = k;
                }
            }
            swap(daten, i, minIndex);
        }
    }

    public static void insertionSort(long daten [])
    {

    }

    public static void quickSort(long daten[])
    {

    }

    public static void mergeSort(long daten[])
    {

    }

}
