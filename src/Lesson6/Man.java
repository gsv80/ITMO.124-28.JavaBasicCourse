package Lesson6;

public abstract class Man {
    private String firstName;
    private String lastName;
    public Man(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    abstract void printData();

}
