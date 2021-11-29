import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String botName = "Aid";
//        int birthYear = 2020;
//
//        System.out.printf("Hello! My name is %s.%n", botName);
//        System.out.printf("I was created in %d.%n", birthYear);
//        System.out.println("Please, remind me your name.");
//        String yourName = scanner.nextLine();
//        System.out.printf("What a great name you have, %s.%n", yourName);
//        System.out.println("Let me guess your age.");
//        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
//
//        int remainder3 = scanner.nextInt();
//        int remainder5 = scanner.nextInt();
//        int remainder7 = scanner.nextInt();
//
//        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
//
//        System.out.printf("Your age is %d; that's a good time to start programming! %n", age);
//
//        System.out.println("Now I will prove to you that I can count to any number you want.");
//
//        int num = scanner.nextInt();
//
//        for (int i = 0; i <= num; i++) {
//            System.out.println(i+"!");
//        }
//        System.out.println("Completed, have a nice day!");


        System.out.println("How many planets are there in the solar system?");

        int a = 1, b = 2, c = 3, d = 4;
        int yourAnswer = 0;

        System.out.printf("%d. To repeat a statement multiple times. %n", a);
        System.out.printf("%d. To decompose a program into several small subroutines. %n", b);
        System.out.printf("%d. To determine the execution time of a program. %n", c);
        System.out.printf("%d. To interrupt the execution of a program. %n", d);


        while (yourAnswer != b) {
            yourAnswer = scanner.nextInt();

            if (yourAnswer == b) {

                System.out.println("Congratulations, have a nice day!");

            } else {
                System.out.println("Please, try again.");
            }
        }
    }

}
