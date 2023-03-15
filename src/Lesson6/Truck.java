package Lesson6;

public class Truck extends Car{
    private int wheelsQuantity;
    private long maxFreight;
    public void newWheels(int wheelsQuantity){
        this.wheelsQuantity = wheelsQuantity;
        System.out.println("Число колес: "+wheelsQuantity);
    }
    public Truck(int w, String m, char c, float s, int wheelsQuantity, long maxFreight) {
        super(w, m, c, s);
        this.wheelsQuantity = wheelsQuantity;
        this.maxFreight = maxFreight;
    }
}
