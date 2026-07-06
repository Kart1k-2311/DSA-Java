package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {5,6,4,3,1,7};
//        bubble(arr);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
    private static void bubble(int[] nums){
        for(int i= 0 ; i < nums.length; i++){
            for(int j = 1; j<nums.length -i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]= nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}
