package Sorting;

import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            int right = nums[i] -1;
            if(nums[right]!=nums[i]){
                swapp(nums, right, i);
            } else{
                i++;
            }
        }
    }
    static void swapp(int[] nums, int first,int last){
        int temp = nums[first];
        nums[first]=nums[last];
        nums[last] = temp;
    }
}
