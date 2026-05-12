package hello;

public class Camera {
    private String brand;
    private int price;

    public Camera(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Camera myCam = new Camera("Samsung", 250000);
        Camera yourCam = new Camera("LG Electronics", 320000);

        System.out.println(myCam.getBrand() + " : " + myCam.getPrice() + "원");
        System.out.println(yourCam.getBrand() + " : " + yourCam.getPrice() + "원");
    }
}
