package genesis.hotlavajava;

import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        Scanner KeyBoard = new Scanner(System.in);
        System.out.print("Please enter the current Temperature in Celcius to convert it to Farenheit: ");
        double celcius = KeyBoard.nextDouble();
        double getTempInFarenheit = ((celcius*9)/5)+32;
        System.out.print("The current Temperature is " + celcius + " °C " 
                + "or " + getTempInFarenheit + " °F ");
        
    }    
}
