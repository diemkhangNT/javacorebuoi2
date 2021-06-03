package vn.plusplus;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity35 {
    public static void main(String[] args) {
        // Program input a Decimal number and print number that in Binary
        // Input a Decimal number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = input.nextInt();
        // Algorithm
        int[] arr = new int[40];
        int i;
        for(i=0;n>0;i++){
            arr[i] = n%2;
            n = n/2;
        }
        System.out.print("Binary number is ");
        for(i=i-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        // or Use method: toBinaryString()
        //System.out.println("Binary number is "+Integer.toBinaryString(n));

    }
}
