package Lesson3;

public class Tree {
    private Long age;
    private Boolean isAlive;
    private String name;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(Long age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Long age, Boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
