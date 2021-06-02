package vn.plusplus;

import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {
        //Chương trình tính tổng e nhỏ hơn 1 số Epsilon < 1
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so Epsilon < 1: ");
        double epsilon = input.nextDouble();
        double e =0;

        for(int i =0;;i++){
            int n =1;
            for(int j=1;j<=i;j++){
                n*=j;
            }
            System.out.println(i+"!"+" = "+n);
            e = e + (double) 1/n;
            if((double)1/n < epsilon ) break;
        }
        System.out.println("Epsilon = "+ epsilon+" va e = "+Math.round(e*1000.0)/1000.0);
    }
}
