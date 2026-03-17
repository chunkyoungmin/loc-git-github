package hello;

import java.util.Random;
import java.util.Scanner;

public class QuizGugudan {
    static void main() {
        Random random= new Random();
        Scanner sc=new Scanner(System.in);
        int first,second,result,answer,wrong=0;
        while (true){
            first=random.nextInt(9);
            second=random.nextInt(9);
            result=first*second;
            System.out.print(first+"X"+second+"=");
            answer=sc.nextInt();
            if (result == answer) {
                System.out.print("정답입니다. 잘했습니다.\n");
            }
            else if(result != answer && wrong<2){
                wrong++;
                System.out.print(wrong+"번 틀렸습니다. 분발하세요.\n");
            } else if (result != answer && wrong>=2) {
                System.out.print(wrong+"번 틀렸습니다. 퀴즈를 종료합니다.\n");
                break;
            }

        }
    }
}
