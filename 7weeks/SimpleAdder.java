package 자바7주차;

interface Addinterface{
    int add(int x, int y);
    int add(int n);
}

public class SimpleAdder implements Addinterface{
    SimpleAdder(){

    }
    @Override
    public int add(int x, int y) {
        return x+y;
    }
    @Override
    public int add(int n) {
        int total=0;
        for (int i = 1; i <= n; i++) {
            total+=i;
        }
        return total;
    }
    static void main(String[] args) {
        SimpleAdder adder = new SimpleAdder();
        System.out.println(adder.add(3,10));
        System.out.println(adder.add(20));
    }
}
