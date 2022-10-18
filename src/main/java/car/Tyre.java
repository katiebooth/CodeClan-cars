package car;

public class Tyre {
    private String brand;
    private int tread;

    public Tyre(String brand, int tread){
        this.brand = brand;
        this.tread = tread;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getTread(){
        return tread;
    }
}
