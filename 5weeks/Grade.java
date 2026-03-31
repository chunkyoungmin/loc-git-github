package hello;

import java.util.Scanner;

public class Grade {
    private String name;
    private int average;

    public Grade(String name,int cpp,int java, int web){
        this.name=name;
        this.average=(cpp+java+web)/3;
    }

    public String getName(){ return  name;}
    public int getAverage() {return  average;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름, C++, Java, Web 순으로 점수 입력>>");
        String name = scanner.next();
        int cpp = scanner.nextInt();
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        Grade st = new Grade(name, cpp, java, web);
        System.out.print(st.getName() + "의 평균은 " + st.getAverage());
        scanner.close();

    }
}