package hello;

import java.util.Scanner;

public class CoffeeOrder {
    static void main() {
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.print("주문 >> ");
            String manu;
            int count,price;
            manu=sc.next();
            if (manu.equals("그만")) {
                break;
            }
            count=sc.nextInt();
            if (count<0){
                System.out.print("잔 수는 양의 정수로 입력해주세요!\n");
            }
            switch (manu){
                case "핫아메리카노":price=3000;break;
                case "아이스아메리카노": price=3500;break;
                case "카푸치노": price=4000;break;
                case "라떼": price=5000;break;
                default:
                    System.out.print(manu+"는 없는 매뉴입니다.\n");
                    sc.nextLine();
                    continue;
            }
            System.out.print("가격은 "+ count*price +"원입니다.\n");
        }
    }
}
