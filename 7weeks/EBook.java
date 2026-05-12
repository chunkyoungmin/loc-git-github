package 자바7주차;

import java.lang.classfile.instruction.StackInstruction;

class Book {
    private String title;
    protected Book(String title) {
        this.title = title;
    }
    protected String getTitle(){return title;}
}
public class EBook extends Book {
    int inch;
    EBook(String title,int inch){
        this.inch=inch;
        super(title);
    }
    public void printinfo() {
        System.out.print(getTitle()+"-전자책은 "+inch+"인치 전차책입니다.\n");
    }

    public void text25peach(int page){
        System.out.print(page+"페이지의 텍스트를 음성으로 출렵합니다.");
    }

    static void main(String[] args) {
        EBook javaBook = new EBook("자바에센셜 전자책",14);
        javaBook.printinfo();
        javaBook.text25peach(3);
    }
}
