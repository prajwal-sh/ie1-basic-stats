public class MinMaxCalculation {
     public static double minmax(double ... numbers) {
        double minimum=numbers[0];
        for (int i=0;i<numbers.length;i++) {
            if(numbers[i]<minimum)
            {
                minimum=numbers[i];
            }

        }
        return minimum;
    }
    
}