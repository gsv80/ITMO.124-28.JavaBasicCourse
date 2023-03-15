package Lesson6;

public class Main {
    public static void main(String[] args) {
        BankEmployee be = new BankEmployee("Petr", "Petrykin");

        be.printData();

        Client cl = new Client("Ivan", "Petrov", "VTB");
        cl.printData();

        Truck truck  = new Truck(5300, "Volvo", 'r', 165f, 6, 18000L  );
        truck.outPut();
        truck.newWheels(6);

        ChildInputNumber inputNum = new ChildInputNumber();

        inputNum.setNumber();
        inputNum.printNumber();

        ChildAgeInput ageInput = new ChildAgeInput();
        ageInput.ageInput();
    }
}
