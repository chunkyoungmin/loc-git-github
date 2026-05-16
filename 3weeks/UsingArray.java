package hello;

import java.util.Scanner;

public class UsingArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int [10];
        int sum=0;
        System.out.print("양의 정수 10개 입력 >>");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("3의 배수는...   ");
        for (int i = 0; i < 10; i++) {
            if (arr[i]%3==0){
                System.out.print(arr[i]+" ");
                sum+=arr[i];
            }
        }
        System.out.print("\n3의 배수의 합은...   "+sum);
    }
}
