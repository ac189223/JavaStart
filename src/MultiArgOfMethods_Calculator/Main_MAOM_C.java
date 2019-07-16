package MultiArgOfMethods_Calculator;

import java.util.Scanner;
import java.util.Random;

public class Main_MAOM_C {

    public static void main(String[] args) {
        Main_MAOM_C main = new Main_MAOM_C();
        main.run();
    }


    private void run() {

        Scanner typedIn = new Scanner(System.in);
        System.out.println("How many numbers would you like to have (between 2 and 20)?");
        int amountNumbers = typedIn.nextInt();
        if (amountNumbers < 2 || amountNumbers > 20) {
            System.out.println("Limit exceeded! Let's have 20 . It is max you can have.")   ;
            amountNumbers = 20;
        }
        System.out.println("");
        int[] numbers = new int[amountNumbers];
        System.out.println("Would you like to type in those numbers or should I generate them?");
        System.out.println("0 - type in");
        System.out.println("1 - generate random numbers");
        System.out.println("2 - generate within given the starting number and the difference between successive ones");
        int generationStyle = typedIn.nextInt();
        switch (generationStyle) {
            case 0:
            case 1:
            case 2:
                break;
            default :
                System.out.println("You cannot decide so I will generate them randomly!")   ;
                generationStyle = 1;
                break;
        }
        System.out.println("");

        if (generationStyle == 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    System.out.print("Type in first number: ");
                } else if (i < numbers.length-1){
                    System.out.print("Type in next number: ");
                } else {
                    System.out.print("Type in last number: ");
                }
                int typedNumber = typedIn.nextInt();
                numbers[i] = typedNumber;
            }
        } else if (generationStyle == 1) {
            for (int i = 0; i < numbers.length; i++) {
                Random generator = new Random();
                numbers[i] = generator.nextInt(50) + 1;
            }
        } else {
            System.out.print("Type in the starting number: ");
            int startNumber = typedIn.nextInt();
            numbers[0] = startNumber;
            System.out.print("Type in the difference between successive numbers: ");
            int difference = typedIn.nextInt();
            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = numbers[i-1] + difference;
            }
        }

        System.out.println("Finally our numbers look like this: ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println("");
        System.out.println("");

        Calculator Calculate = new Calculator();
        int additionResult = Calculate.addition(numbers);
        System.out.println("The result of adding is " + additionResult + ".");
        String productResult = Calculate.product(numbers);
        System.out.println(productResult);
    }



}
