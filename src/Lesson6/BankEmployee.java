package Lesson6;

public class BankEmployee extends Man implements Bank {

    public BankEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    void printData() {
        System.out.println("Работник банка"+"\n"+
                "Name: " + getFirstName()+"\n"+
                "LastName: "+ getLastName()+"\n"+
                "BANK: " +BANK);
    }
}
