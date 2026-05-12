package Season;

import java.util.Scanner;

public class SeasonSwitch {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.print("월을 입력하세요(1~12)>>");
        month= sc.nextInt();
        switch (month){
            case 3: case 4: case 5:System.out.print("따뜻한 봄");break;
            case 6: case 7: case 8:System.out.print("바다가 즐거운 여름");break;
            case 9: case 10: case 11:System.out.print("낙엽이 지는 아름다운 가을");break;
            case 12: case 1: case 2:System.out.print("눈 내리는 하얀 겨울");break;
            default:System.out.print("1~12만 입력하세요.");break;
        }
    }
}
