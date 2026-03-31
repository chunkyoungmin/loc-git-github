package hello;

public class Cube {
    private int gr;
    private int sr;
    private int hight;

    public Cube(int a,int b,int c){
        this.gr=a;
        this.sr=b;
        this.hight=c;
    }

    public int getVolume(){return gr*sr*hight;}
    public void increase(int a, int b, int c){
        gr+=a;
        sr+=b;
        hight+=c;
    }
    public boolean isZero(){
        return getVolume()==0;
    }


    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        // 가로, 세로, 높이가각각1, 2, 3인큐브객체생성
        System.out.println("큐브의부피는" + cube.getVolume());
        cube.increase(1,2,3); // 가로, 세로, 높이각각1,2,3 씩증가
        System.out.println("큐브의부피는" + cube.getVolume());
        if (cube.isZero())
            System.out.println("큐브의부피는0");
        else
            System.out.println("큐브의부피는0이아님");
    }

}
