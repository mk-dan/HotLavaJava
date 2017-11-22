package genesis.random;

class BenchmarkTest{
    public static void main(String[] arguments) {
        
       // set startTime, endTime variable and initial value of index
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60_000;
        long index = 0;
        
       // while loop begins with true as the conditional statement 
        while (true) {
        
       // calculates and stores the square root of index in the variable x      
            double x = Math.sqrt(index);
            
       // create now variable with the current time      
            long now = System.currentTimeMillis();
            
       // ends while loop if now is greater than endTime meaning the loop has ran for a minute      
            if (now > endTime) {
                break;
            }
            index++;
        }
       // display the number of times the square root calculation is performed e.g. 2 billion + times
        System.out.println(index + " loops in a minute");
    }
}