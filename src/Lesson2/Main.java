package Lesson2;

public class Main {
    public static void main(String[] args) {

//        Lesson 2 Task 1
        Calculator calcDivInt = new Calculator();
        calcDivInt.div(5,3);
        calcDivInt.div(5d,3d);
        calcDivInt.mult(5.0,3.0);

//        Lesson 2 Task 2
        Pump pumpTest = new Pump();
        System.out.println(pumpTest);

        Pump flygtNP = new Pump(PumpType.Console,Installation.Submersible, "Waste Water", true);
        System.out.println(flygtNP);

        Pump np3153 = new Pump(PumpType.Console, Installation.Submersible, "Waste Water", 150.0, 20.1,true, 13.5 );
        System.out.println(np3153);

        Pump asPumps = new Pump(PumpType.SplitCase,Installation.DryHorizontal,"Clean Water", true);
        asPumps.setMotor(355.0);
        System.out.println(asPumps);

    }
}
