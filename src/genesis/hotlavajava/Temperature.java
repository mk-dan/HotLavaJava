package genesis.hotlavajava;

import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        Scanner KeyBoard = new Scanner(System.in);
        System.out.print("Please enter the current Temperature: ");
        double celcius = KeyBoard.nextDouble();
        System.out.print("The current Temperature is " + celcius + " °C ");
    }
}
