package sort;

public class ShellSort {

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array){
        int len = array.length;
        int gap = len/2;
        int cur;
        while(gap > 0){
            for(int i = gap;i < len;i++){
                int preIndex = i -gap;
                cur = array[i];
                while(preIndex >=0 && cur < array[preIndex]){
                    array[preIndex+gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex+gap] = cur;
            }
            gap /= 2;
        }
        return array;
    }
}
