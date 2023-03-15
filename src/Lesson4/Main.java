package Lesson4;

//import static Lesson4.PartOne.isIncludesNum;

public class Main {
//     test array for Part 1
    private  static int[] arPart1 = {2,4,5,6,7,4,8,3};
//    test array for Part 2
    private static int[] arPart2 = new int[] {1,1,1,3,3,1,3,1};
    public static void main(String[] args) {
//      Check Part One tasks:
//        Task1.
        System.out.println("Task1");
//        PartOne.printEven(99);
        System.out.println("=================");

//        Task2.
        System.out.println("Task2");
        PartOne.multipleThreeFive(100);
        System.out.println("=================");

//        Task3.
        System.out.println("Task3");
//        System.out.println(PartOne.checkSum());
        System.out.println("=================");

//        Task4.
        System.out.println("Task4");
//        System.out.println(PartOne.threeNumOrdered());
        System.out.println("=================");

//        Task5.
        System.out.println("Task5");
//        System.out.println(PartOne.firstLastElThree(arPart1));
        System.out.println("=================");

//        Task6.
        System.out.println("Task6");
//        System.out.println(PartOne.isIncludesNum(arPart1));
        System.out.println("=================");

        System.out.println("Part Two.");
//        Task1.
        System.out.println("Task1");
//        PartTwo.isSorted(arPart2);
        System.out.println("=================");

        System.out.println("Task2");
//        PartTwo.inputArray();
        System.out.println("=================");

        System.out.println("Task3");
//        PartTwo.swapLastFirst(arPart2);
        System.out.println("=================");

        System.out.println("Task4");
        System.out.println(PartTwo.findUniq(arPart2));
        System.out.println("=================");
    }
}
