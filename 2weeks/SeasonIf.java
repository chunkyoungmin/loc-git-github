package Season;

import java.util.Scanner;

public class SeasonIf {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.print("월을 입력하세요(1~12)>>");
        month= sc.nextInt();
        if (5>=month && month>=3){
            System.out.print("따뜻한 봄");
        }
        else if (8>=month && month>=6){
            System.out.print("바다가 즐거운 여름");
        }
        else if (11>=month && month>=9){
            System.out.print("낙엽이 지는 아름다운 가을");
        }
        else if (12==month || month<=2){
            System.out.print("눈 내리는 하얀 겨울");
        }
        else{
            System.out.print("1~12만 입력하세요.");
        }
    }
}
