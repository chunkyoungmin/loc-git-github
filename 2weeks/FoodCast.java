package hello;

import java.util.Scanner;

public class FoodCast {
    public static void main(String[] args) {
        int number;
        int cast=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("떡볶이 몇 인분>>");
        number=sc.nextInt();
        cast+=number*2000;
        System.out.print("김말이 몇 인분>>");
        number=sc.nextInt();
        cast+=number*1000;
        System.out.print("쫄면 몇 인분>>");
        number=sc.nextInt();
        cast+=number*3000;
        System.out.println("전체 금액은"+cast+"원입니다.");
    }
}
