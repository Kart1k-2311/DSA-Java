package Sorting;

import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,7,1,2,4,};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            Swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] nums , int end){
        int max = 0;
        for(int i =0; i<end;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    static void Swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;

    }
}
