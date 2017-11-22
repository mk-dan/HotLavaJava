package genesis.random;

class BenchmarkTest{
    public static void main(String[] arguments) {
        
        // set startTime, endTime variable and initial value of index
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60_000;
        long index = 0;
        
        // while loop
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            index++;
        }
        // display the number of times the square root calculation is performed
        System.out.println(index + " loops in a minute");
    }
}