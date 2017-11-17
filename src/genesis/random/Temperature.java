package genesis.random;

import java.time.*;
import java.time.temporal.*;
import java.util.Scanner;

class Temperature{
    
    public static void main(String[] arguments){
        
        // get current time and date
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        //int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        //int month = now.get(ChronoField.MONTH_OF_YEAR);
        //int day = now.get(ChronoField.DAY_OF_MONTH);
        //int year = now.get(ChronoField.YEAR);
        
        // display greeting
         if (hour < 12) {
             System.out.println("Good morning.\n");
         } else if (hour < 17 ) {
             System.out.println("Good afternoon.\n");
         } else {
             System.out.println("Good evening.\n");
         }
        
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Please enter a Temperature in Celsius to convert it to Farenheit and Kelvin: ");
        
        double celsius = keyBoard.nextDouble();
        double getTempInFarenheit = ((celsius*9)/5)+32;
        double getTempInKelvin = (celsius)+273.15;
        
        // display the current Temperature in Celsius, Farenheit and Kelvin
        System.out.println("\nThe current Temperature is " + celsius + " °C " 
                + "\nor \n " + getTempInFarenheit + " °F "
                + "\nor \n " + getTempInKelvin + " K \n");
        
        // display a conditional message based on the Temperature entered
        if (celsius <= 10) {
            System.out.println("Wrap Up, its about to be chilly!!\n");
        } else if (celsius >= 30) {
            System.out.println("Don't forget to use sunscreen\n");
        } else {
            System.out.println("Normal Temperature\n");
        }
        
    }    
}
