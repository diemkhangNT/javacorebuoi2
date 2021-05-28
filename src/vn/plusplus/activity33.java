package vn.plusplus;

import java.util.Scanner;

public class activity33 {
    public static void main(String[] args) {
        //Nhập 1 số epsilon tìm giai thừa đến số đó và in ra kq của e = 1+1+1/1!+1/2!+...+1/epsilon!
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
