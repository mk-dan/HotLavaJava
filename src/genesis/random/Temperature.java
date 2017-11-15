package genesis.random;

import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Please enter a Temperature in Celsius to convert it to Farenheit and Kelvin: ");
        
        double celsius = keyBoard.nextDouble();
        double getTempInFarenheit = ((celsius*9)/5)+32;
        double getTempInKelvin = (celsius)+273.15;
        
        System.out.println("The current Temperature is " + celsius + " °C " 
                + "or " + getTempInFarenheit + " °F "
                + "or " + getTempInKelvin + " K ");
    }    
}
