package sort;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {23,324,4545,53,32,2,6,7};
        quickSort(arr,0,7);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static int[] quickSort(int[] arr,int left,int right){
        if(left >= right){
            return null;
        }else{
            int pivot = arr[left];
            int i = left;
            int j = right;
            while(i < j){
                while(i < j && arr[j] >= pivot){
                    j--;
                }
                arr[i] = arr[j];
                while(i < j && arr[i] <= pivot){
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = pivot;
            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
        }
        return arr;
    }
}
