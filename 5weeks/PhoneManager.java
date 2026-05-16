package 자바5주차;

import java.util.Scanner;

class Phone{
    private String name;
    private String ph;
    public Phone(String name,String p_number){
        this.name=name;
        this.ph=p_number;
    }
    public String getName(){
        return name;
    }
    public String getPh(){
        return ph;
    }
}

public class PhoneManager {
    private Phone[] phones;
    public PhoneManager(int n){
        phones=new Phone[n];
    }
    public void input(Scanner sc) {
        for (int i = 0; i < phones.length; i++) {
            System.out.print("이름과 전화번호>>");
            String name = sc.next();
            String ph = sc.next();
            phones[i] = new Phone(name, ph);
        }
        System.out.print("저장되었습니다...");
    }

    public void search(Scanner sc){
        while (true){
            System.out.print("검색할 이름>>");
            String find_name=sc.next();
            if (find_name.equals("그만")) {
                System.out.print("프로그램을 종료합니다...");
                break;
            }
            boolean found = false;

            for (int i = 0; i < phones.length; i++) {
                if (phones[i].getName().equals(find_name)) {
                    System.out.println(find_name + "의 번호는 " + phones[i].getPh() + " 입니다.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(find_name + " 이 없습니다.");
            }
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("사람수>>");
        int n=sc.nextInt();
        PhoneManager manager = new PhoneManager(n);
        manager.input(sc);
        manager.search(sc);
    }
}
