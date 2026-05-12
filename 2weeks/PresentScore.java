package PresentScore;

import java.util.Scanner;

public class PresentScore {
    public static void main(String[] args) {
        int late,late1,no,no1;
        Scanner sc=new Scanner(System.in);
        System.out.print("이름 지각 결석 횟수를 입력하세요>>");
        String first=sc.next();
        late=sc.nextInt();
        no=sc.nextInt();
        System.out.print("이름 지각 결석 횟수를 입력하세요>>");
        String second=sc.next();
        late1=sc.nextInt();
        no1=sc.nextInt();
        if ((100-late*2-no*5)>(100-late1*2-no1*5)){
            System.out.print("출석 점수가 높은 학생은 "+first+"입니다.");
        }
        else {
            System.out.print("출석 점수가 높은 학생은"+second+"입니다.");
        }
    }
}
