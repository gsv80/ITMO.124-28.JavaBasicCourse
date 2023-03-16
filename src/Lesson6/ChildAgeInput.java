package Lesson6;

public class ChildAgeInput extends ParentAgeInput {
    @Override
    public void ageInput() {
        System.out.println("Введите возраст:  ");
        age = scn.nextInt();
    }

}
