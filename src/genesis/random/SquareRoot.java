package genesis.random;

import java.util.Scanner;

class SqaureRoot {
    
    public static void main(String[] arguments) {
        
        System.out.println("Please enter a number ");
        
        Scanner keyBoard = new Scanner(System.in);
        double number = keyBoard.nextDouble();
        
                System.out.println("\nThe square root of "
                + number
                + "\n is "
                + Math.sqrt(number)
                + "\n");                  
    }
}