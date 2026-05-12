package Grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학점을 입력하세요>>");
        String grade=sc.next();

        switch (grade){
            case "A+":
            case "A":
                System.out.println("Excellent");
                break;
            case "B+":
            case "B":
                System.out.println("Good");
                break;
            case "C+":
            case "C":
            case "D":
                System.out.println("Study More");
                break;
            case "F":
                System.out.println("See you");
                break;
            default:
                System.out.println("잘못 입력");
                break;
        }
    }
}
