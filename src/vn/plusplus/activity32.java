package vn.plusplus;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class activity32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu cao tam giac: ");
        int n = input.nextInt();
        int i,j;
        for ( i = 1; i <= n; i++)
        {
            for (j = 1; j <= n - i; j++)
                System.out.print("^");
            for (j = 1; j <= 2 * i - 1;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
