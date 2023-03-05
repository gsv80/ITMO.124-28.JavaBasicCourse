package Lesson3;

public class Car {
    private String color;
    private String name;
    private Long weight;

    public Car(){

    }
    public  Car(String color){
        this.color = color;
    }
    public Car(String color, Long weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Long getWeight(){
        return weight;
    }
    public void setWeight(Long weight){
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Car{" +
                " name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
