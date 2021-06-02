package vn.plusplus;

import java.util.Scanner;

public class Activity34 {
    public static void main(String[] args) {
        //Chương trình tính tổng và trung bình cộng từ 1 đến n
        // Nhập số nguyên n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =input.nextInt();
        // Khởi tạo biến i và sum
        int i=1,sum = 0;
        // Dùng for
//        System.out.println("-------for--------");
//        for(i=1;i<=n;i++){
//            sum += i;
//        }
//        System.out.println("The sum of 1 to "+n+" is "+sum);
//        System.out.println("The average is " + (double)sum/n);

        // Dùng while
//        System.out.println("-------while--------");
//        while(i<=n){
//            sum+=i;
//            i++;
//        }
//        System.out.println("The sum of 1 to "+n+" is "+sum);
//        System.out.println("The average is " + (double)sum/n);

        // Dùng do-while
        System.out.println("-------do-while--------");
        do{
            sum+=i;
            i++;
        }while(i<=n);
        System.out.println("The sum of 1 to "+n+" is "+sum);
        System.out.println("The average is " + (double)sum/n);
    }
}
