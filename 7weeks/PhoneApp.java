package 자바7주차;

interface IBook {
    void add(String name, String value); // name과 value를 항목으로 저장
    void delete(String name); // name을 찾아서 항목 삭제
    String search(String name); // name과 일치하는 항목 찾아 value 리턴
    int getLength(); // 저장된 항목의 개수 리턴
    void printAll();
}

class PhoneBook implements IBook{
    private String [][] list;
    private int capacity;
    private int count;
    PhoneBook(int capacity){
        this.list=new String[capacity][2];
        this.capacity=capacity;
        this.count=0;
    }
    @Override
    public void add(String name, String value){
        if (count>=capacity){System.out.println("전화번호 다 참");return;}
        list[count][0]=name;
        list[count][1]=value;
        count++;
    }
    @Override
    public void delete(String name){
        for (int i = 0; i < capacity; i++) {
            if (name.equals(list[i][0])){
                for (int j = i; j < capacity-1; j++) {
                    list[j][0]=list[j+1][0];
                    list[j][1]=list[j+1][1];
                }
            }
        }
        capacity--;
    }
    @Override
    public String search(String name){
        for (int i = 0; i < capacity; i++) {
            if (name.equals(list[i][0])){
                return list[i][1];
            }
        }
        return "없음";
    }
    @Override
    public int getLength(){
        return capacity;
    }
    @Override
    public void printAll(){
        for (int i = 0; i < capacity; i++) {
            System.out.println(list[i][0]+":"+list[i][1]);
        }
    }
}

public class PhoneApp {
    public static void main(String[] args) {
        IBook pBook = new PhoneBook(3); // 3개의 전화번호를 저장할 객체 생성
        pBook.add("황기태", "1111"); // 저장
        pBook.add("한지운", "7777"); // 저장
        pBook.add("박채원", "5555"); // 저장
        pBook.add("옥지윤", "9999"); // 저장하지만 꽉 차 있어서 실패
        System.out.println("저장된 항목 수는 : " + pBook.getLength()); //3 출력
        pBook.delete("한지운"); // 삭제
        System.out.println("박채원의 전화번호는 " + pBook.search("박채원")); // 검색
        pBook.printAll(); // 전체 출력
    }

}
