package hello;

import java.util.Random;

public class UsingArrayWithRandomint {
    static void main() {
        Random random = new Random();
        int[] arr= new int [10];
        int sum=0,rand_sum=0;

        System.out.print("10개의 정수는... ");
        for (int i = 0; i < 10; i++) {
            arr[i]=random.nextInt(9)+10;
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }

        System.out.print("\n해당 정수의 합계는...   "+ sum);
    }
}
