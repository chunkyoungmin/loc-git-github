package 자바7주차;

import java.util.Scanner;
abstract class Player {
    protected String shape [] = {"가위", "바위", "보"};
    private String name;
    public Player(String name) { this.name = name; }
    public String getName() { return name; }
    abstract public String turn(); // 선수가 자신의 차례일 때 가위, 바위, 보 중 하나 리턴
}
class MachinePlayer extends Player {
    public MachinePlayer(String name) { super(name); }
    public String turn() { // 기계는 가위, 바위, 보 중 랜덤하게 한 개 리턴
        return shape[(int)(Math.random()*3)];
    }
}
class HumanPlayer extends Player {
    public HumanPlayer(String name){super(name);}
    public String turn(){
        Scanner sc=new Scanner(System.in);
        String humanshape= sc.next();
        return humanshape;
    }
}

public class App {
    static void main(String[] args) {
        Player machine = new MachinePlayer("터미네이터");
        Player human = new HumanPlayer("황기태");
        String m = machine.turn(); // 기계가 낸 가위, 바위, 보
        String h = human.turn();// 사람이 낸 가위, 바위, 보
        System.out.println(machine.getName() + ":" + m + ", " + human.getName() + ":" + h);
        if(h.equals(m)) System.out.println(machine.getName() + " 승리!");
        else System.out.println(human.getName() + " 승리!");
    }
}
