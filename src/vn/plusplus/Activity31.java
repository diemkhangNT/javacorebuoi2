package vn.plusplus;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        // Chương trình tính số Fibonaci
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai day fibo: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int i=0;
        while(i<n){
            arr[i] = i;
            if(arr[i] > 1){
                arr[i] = arr[i-1] + arr[i-2];
            }
            System.out.print(arr[i]+" ");
            i++;
        }

    }

}
