package 자바5주차;

import java.util.Scanner;

public class Chart {
    private String title;
    private String type=null;
    private int[] data;
    private int next=0;

    public Chart(String title,String type,int n){
        this.title=title;
        this.type=type;
        this.data=new int[n];
    }

    public String getTitle(){return title;}
    public int getCapacity(){return data.length;}
    public void add(int n){
        data[next++]=n;
    }
    public double getAvg(){
        int sum=0;
        for (int i = 0; i < next; i++) {
            sum+=data[i];
        }
        return (double) sum/data.length;
    }
    public void draw(){
        System.out.print(title+": "+type+" 차트로 그리기 ****\n");
        for (int i = 0; i < next; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.print("평균: "+ getAvg()+"\n");
    }

    static void main(String[] args) {
        Chart tempChart=new Chart("온도","Line",7);
        Chart gradeChart=new Chart("성적","bar",4);
        Scanner scanner = new Scanner(System.in);
        System.out.print(tempChart.getTitle()+" "+tempChart.getCapacity()+"개>>");
        for (int i = 0; i < tempChart.getCapacity(); i++) {
            tempChart.add(scanner.nextInt());
        }
        System.out.print(gradeChart.getTitle()+" "+gradeChart.getCapacity()+"개>>");
        for (int i = 0; i < gradeChart.getCapacity(); i++) {
            gradeChart.add(scanner.nextInt());
        }
        tempChart.draw();
        gradeChart.draw();
    }
}
