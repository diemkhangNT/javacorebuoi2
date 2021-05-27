package vn.plusplus;

import java.util.Scanner;

public class activity33 {
    public static void main(String[] args) {
        //Nhập 1 số epsilon tìm giai thừa đến số đó và in ra kq của e = 1+1+1/1!+1/2!+...+1/epsilon!
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so Epsilon < 1: ");
        int epsilon = input.nextInt();
        double e =0;

        for(int i =0;i<=epsilon;i++){
            int gt =1;
            for(int j=1;j<=i;j++){
                gt*=j;
            }
            System.out.println(i+"!"+" = "+gt);
            e = e + (double) 1/gt;
        }
        System.out.println("Epsilon = "+ epsilon+" va e = "+Math.round(e*1000.0)/1000.0);
    }
}
