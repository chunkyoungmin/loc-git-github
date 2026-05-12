package 자바7주차;

import javax.swing.plaf.ColorChooserUI;
import javax.swing.plaf.IconUIResource;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

class CCTV{
    private String resolution;
    public CCTV(String resolution){this.resolution=resolution;}
    protected String getResolution(){return resolution;}

}

public class AICCTV extends CCTV {
    boolean faceRecognition;
    AICCTV(String resolution, boolean faceResolution){
        super(resolution);
        this.faceRecognition=faceResolution;
    }
    public void printinfo(){
        String status=faceRecognition?"중":"하지 않음";
        System.out.print("CCTV는 "+ getResolution() +"급이며, 현재 얼굴 인식 작동"+status);
    }
    public static void main(String[] args) {
        AICCTV ai=new AICCTV("FHD", true);
        ai.printinfo();
    }
}
