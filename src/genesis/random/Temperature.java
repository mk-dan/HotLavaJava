package genesis.random;

import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        Scanner KeyBoard = new Scanner(System.in);
        System.out.println("Please enter the current Temperature in Celsius to convert it to Farenheit and Kelvin: ");
        double Celsius = KeyBoard.nextDouble();
        double getTempInFarenheit = ((Celsius*9)/5)+32;
        double getTempInKelvin = (Celsius)+273.15;
        System.out.println("The current Temperature is " + Celsius + " °C " 
                + "or " + getTempInFarenheit + " °F "
                + "or " + getTempInKelvin + " K ");
    }    
}
