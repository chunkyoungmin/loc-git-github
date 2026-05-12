package Calc;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int number;
        int number1;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요>>");
        number = sc.nextInt();
        number1=sc.nextInt();
        System.out.println(number+"+"+number1+"="+(number+number1)+"\n"+number+"-"+number1+"="+(number-number1)+"\n"+number+"*"+number1+"="+(number*number1));

    }
}
