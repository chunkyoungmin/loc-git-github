package 자바5주차;

import java.util.Scanner;

class Seat{
    private String name;
    private int number;
    public Seat(String name,int number){
        this.name=name;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
}

public class Reservation {

    private Seat[] list;
    public Reservation(){
        list=new Seat[5];
    }

    public void input(Scanner sc){
        int n=0;
        while (n<5){
            System.out.print("예약자 이름과 고객수를 입력하세요>>");
            String name=sc.next();
            if (name.equals("매니저")){
                current_seat(n);
                continue;
            }
            int num= sc.nextInt();
            n++;
            System.out.print(name+"님: 예약 좌석"+n+"번\n");
            list[n-1]=new Seat(name,num);
        }
        System.out.print("만석입니다. 예약을 종료합니다ㅏ.\n");
        current_seat(5);
    }
    public void current_seat(int n){
        System.out.print("현재 예약자를 출력합니다.\n");
        for (int i = 0; i < n; i++) {
            System.out.print("좌석"+(i+1)+": "+list[i].getName()+" "+list[i].getNumber()+"명\n");
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Reservation list=new Reservation();
        list.input(sc);
    }
}
