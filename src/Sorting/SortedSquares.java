package Sorting;
import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {-1 ,23 ,456,64};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] ans = sortedSquares(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        return arr;
    }
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
