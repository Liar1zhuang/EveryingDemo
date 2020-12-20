package sort;

import java.util.Arrays;

import static sort.BubbleSort.bubbleSort;
import static sort.HeapSort.heapSort;
import static sort.InsertionSort.insertionSort;
import static sort.MergeSort.mergeSort;
import static sort.QuickSort.quickSort;
import static sort.SelectionSort.selectionSort;
import static sort.ShellSort.shellSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,3,1};


//        bubbleSort(arr);
//        selectionSort(arr);
//          arr = mergeSort(arr);

//          arr = insertionSort(arr);
//        shellSort(arr);
//        heapSort(arr);
        quickSort(arr,0,arr.length-1);
//
        for (int i : arr){
            System.out.println(i);
        }

    }
}
