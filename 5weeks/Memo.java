package hello;

public class Memo {

    private String name;
    private String time;
    private String memo;

    public Memo(String name,String time,String memo){
        this.name=name;
        this.time=time;
        this.memo=memo;
    }

    public void show(){
        System.out.print(name+","+time+","+memo+"\n");
    }
    public boolean isSameTime(Memo b){
        if (time.equals(b.time))return true;
        else return false;
    }
    public String getName(){
        return name;
    }
    public int length(){
        return memo.length();
    }


    public static void main(String[] args) {
        Memo a = new Memo("옥지윤", "09:00", "경진대회준비");
        Memo b = new Memo("박채원", "09:00", "그래프DB 설치필요");
        Memo c = new Memo("성주연", "11:30", "EPUB Reader 코딩");
        a.show();
        if (a.isSameTime(b)) System.out.println("메모시간동일");
        else System.out.println("메모시간다름");
        System.out.println(c.getName() + "이작성한메모의길이는" + c.length() + "글자");
    }
}