package Lesson6;

public class Client extends Man{

    private String bank;

    public String getBank() {
        return bank;
    }



    public Client(String firstName, String lastName, String bank) {
        super(firstName, lastName);
        this.bank = bank;
    }

    @Override
    void printData() {
        System.out.println("Клиент:" + "\n"+
                "Имя: " + getFirstName() + "\n"+
                "Фамилия: " + getLastName()+ "\n"+
                "Банк: " + getBank()
        );
    }
}
