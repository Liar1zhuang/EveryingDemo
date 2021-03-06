package sort;

public class InsertionSort {
    /**
     * 直接插入排序
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array){
        for(int i = 1;i < array.length;i++){
            int j = i;
            while(j > 0 && array[j] < array[j-1]){
                swap(array,j,j-1);
                j--;
            }
        }
        return array;
    }
//        if(array.length == 0)
//            return array;
//        for(int i = 0;i < array.length-1;i++){
//            int cur = array[i+1];
//            int pre = i;
//            //如果当前值小于前方的值，则将前方的值后移
//            while(pre >= 0 && cur < array[pre]){
//                array[pre+1] = array[pre];
//                pre--;
//            }
//            array[pre+1] = cur;
//        }
//        return array;


    private static void swap(int[] arrays,int i,int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

}
