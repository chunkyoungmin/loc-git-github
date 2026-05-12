package 자바7주차;

class Phone{
    private String brand;
    public Phone(String brand){this.brand=brand;}
    protected String getBrand(){return brand;}
    protected void call(){System.out.println("띠리리리링~~");}
}

public class CalcPhone extends Phone{
    String brand;
    CalcPhone(String brand){
        super(brand);
    }
    public int calc(String rlgh, int a,int b){
        int c;
        switch (rlgh){
            case "+": c=a+b;break;
            case "-": c=a-b;break;
            case "*": c=a*b;break;
            case "/": c=a/b;break;
            default: c=0;break;
        }
        return c;
    }
    static void main(String[] args) {
        CalcPhone myPhone = new CalcPhone("Galaxy");
        System.out.println("저의 전화기는 " + myPhone.getBrand() + "입니다.");
        myPhone.call();
        System.out.println("계산도 됩니다. 2+3은 " + myPhone.calc("+", 2, 3));
    }
}