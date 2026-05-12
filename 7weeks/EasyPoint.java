package 자바7주차;

class Point{
    private int x,y;
    public Point(int x,int y){this.x=x;this.y=y;}
    protected int getX(){return x;}
    protected int getY(){return y;}
    protected void move(int x,int y){this.x=x;this.y=y;}
}

public class EasyPoint extends Point{
    private int a,b;
    EasyPoint(int x,int y,int a,int b){
        super(x,y);
        this.a=a;
        this.b=b;
    }
    public void moveUp(){
        move(getX(),getY()+a);
    }
    public void moveDown(){
        move(getX(),getY()-a);
    }
    public void moveRight(){
        move(getX()+a,getY());
    }
    public void moveLeft(){
        move(getX()-a,getY());
    }
    public void show(){
        System.out.println("("+getX()+","+getY()+")");
    }
    static void main(String[] args) {
        EasyPoint ep = new EasyPoint(3,5,2,2);
        ep.moveUp(); // 2만큼 위로 이동
        ep.moveRight(); // 2만큼 오른쪽으로 이동
        ep.show(); // (5,7) 출력
        ep.moveDown(); // 2만큼 아래로 이동
        ep.moveLeft(); // 2만큼 왼쪽으로 이동
        ep.show(); // (3,5) 출
    }
}
