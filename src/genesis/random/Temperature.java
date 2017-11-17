package genesis.random;

import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Please enter a Temperature in Celsius to convert it to Farenheit and Kelvin: ");
        
        double celsius = keyBoard.nextDouble();
        double getTempInFarenheit = ((celsius*9)/5)+32;
        double getTempInKelvin = (celsius)+273.15;
        
        System.out.println("\nThe current Temperature is " + celsius + " °C " 
                + "\nor \n " + getTempInFarenheit + " °F "
                + "\nor \n " + getTempInKelvin + " K \n");
        
        if (celsius <= 10) {
            System.out.println("Wrap Up, its about to be chilly!!\n");
        } else if (celsius >= 30) {
            System.out.println("Don't forget to SPF\n");
        } else {
            System.out.println("Normal Temperature\n");
        }
        
    }    
}
