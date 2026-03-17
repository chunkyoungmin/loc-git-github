package hello;

import java.util.Random;

public class TwoDemArray {
    static void main() {
        Random random = new Random();
        int[][] arr= new int [4][4];
        int sum=0,rand_sum=0;

        System.out.print("4x4 배열에 랜덤한 값을 저장한 후 출력합니다. \n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = random.nextInt(256);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
