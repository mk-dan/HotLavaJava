package genesis.random;

import java.util.Scanner;

class SqaureRoot {
    public static void main(String[] arguments) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Please enter a number ");
        double number = keyBoard.nextDouble();
                System.out.println("The square root of "
                + number
                + " is "
                + Math.sqrt(number)
                );                  
    }
}