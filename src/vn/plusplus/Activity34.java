package vn.plusplus;

import java.util.Scanner;

public class Activity34 {
    public static void main(String[] args) {
        //Chương trình tính tổng và trung bình cộng từ 1 đến n
        // Nhập số nguyên n
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        // Tính tổng
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
