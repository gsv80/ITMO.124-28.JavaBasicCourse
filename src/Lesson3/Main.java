package Lesson3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        Task 1 performed in Study.java

//        Task 2.

        Car ferrari308= new Car("Желтый");
        ferrari308.setName("Ferrari 308 GTB");
        ferrari308.setWeight(1090L);

        Car porsche911 = new Car("Metallic Green", 1100L);
        porsche911.setName("Porsche 911 B17");


        System.out.println(ferrari308.toString());
        System.out.println(porsche911.toString());

//        Task 3.
        House cottage = new House(1L,2009L, "Country Cottage");
        System.out.println(cottage);
        System.out.println(cottage.getAge());

        House moscowTower = new House( 2005L, "Moscow Tower" );
        moscowTower.setFloors(52L);
        System.out.println(moscowTower);
        System.out.println(moscowTower.getAge());

//        Task 4.
        Tree emptyTree = new Tree();

        Tree oak = new Tree(200L, true, "Oak");
        System.out.println(oak.toString());

        Tree elm = new Tree(55L, "Elm");
        System.out.println(elm.toString());

    }
}
