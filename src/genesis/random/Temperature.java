package genesis.random;

import java.time.*;
import java.time.temporal.*;
import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        // get current time and date
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        
        // display greeting based on the value of the hour variable
         if (hour < 12) {
             System.out.println("Good morning.\n");
         } else if (hour < 17 ) {
             System.out.println("Good afternoon.\n");
         } else {
             System.out.println("Good evening.\n");
         }
        
        // display enter temperature message
        System.out.println("Please enter a Temperature in Celsius to convert it to Farenheit and Kelvin: ");
        
        // set variable to hold entered temperature
        Scanner keyBoard = new Scanner(System.in);
        double celsius = keyBoard.nextDouble();
        double getTempInFarenheit = ((celsius*9)/5)+32;
        double getTempInKelvin = (celsius)+273.15;
        
        // display the current temperature in celsius, farenheit and kelvin
        System.out.println("\nThe current Temperature is " + celsius + " °C " 
                + "\nor \n " + getTempInFarenheit + " °F "
                + "\nor \n " + getTempInKelvin + " K \n");
        
        // display a conditional message based on the temperature entered
        if (celsius <= 10) {
            System.out.println("Wrap Up, its about to be chilly!!\n");
        } else if (celsius >= 30) {
            System.out.println("Don't forget to use sunscreen\n");
        } else {
            System.out.println("Normal Temperature\n");
        }
        
    }    
}
