package Bitwise;
import java.util.Scanner;

public class IsOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 61;
        boolean s = OddEven(n);
        if(s){
            System.out.print("Odd");
        } else{
            System.out.print("Even");
        }
    }
    public static boolean OddEven(int n){
        return (n & 1) == 1;
    }
}
