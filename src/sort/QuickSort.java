package sort;


public class QuickSort {
    public static int[] quickSort(int[] arr, int left, int right) {
        if (left >= right) return null;

        // 注意，middle 已经排序，不需要重新排序
        int middle = paritition(arr, left, right);
        quickSort(arr, left, middle - 1);
        quickSort(arr, middle + 1, right);
        return arr;
    }

    /**
     * 快速排序核心算法：分区算法，以任意元素为分区点 pivot，将小于等于 pivot 放到右边，大于 pivot 放到左边
     * 分区算法：1. 如果使用多个数组进行分区计算，虽然非常简单，但空间复杂度为 O(n)，和归并算法没有本质的提升
     *          2. 如果使用原地算法，空间复杂度为 O(1)，但也会导致相等元素乱序，是不稳定算法
     *
     * @param arr   要分区的数组
     * @param left  数组最小位置
     * @param right 数组最在位置
     * @return 中间值所有位置
     */
    private static int paritition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

}
	
