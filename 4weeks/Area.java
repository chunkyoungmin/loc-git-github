package hello;

import java.util.Scanner;

public class Area {
    private String name, areaCode;
    public Area(String name, String areaCode) {
        this.name = name;
        this.areaCode = areaCode;
    }
    public String getName() { return name; }
    public String getAreaCode() { return areaCode; }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("지역 이름과 지역 코드 입력>>");
        String name1=sc.next();
        String code1=sc.next();
        System.out.print("지역 이름과 지역 코드 입력>>");
        String name2=sc.next();
        String code2=sc.next();

        Area area1 = new Area(name1,code1);
        Area area2 = new Area(name2,code2);

        System.out.print(area1.name+"의 지역코드는"+area1.areaCode);
        System.out.print(area2.name+"의 지역코드는"+area2.areaCode);
        sc.close();
    }
}