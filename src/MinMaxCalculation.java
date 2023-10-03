public class MinMaxCalculation {
     public static double[] minmax(double ... numbers) {
        double sum = 0;
        double minimum=numbers[0];
        double maximum=numbers[0];
        for (int i=0;i<numbers.length;i++) {
            if(numbers[i]<minimum)
            {
                minimum=numbers[i];
            }
            else if(numbers[i]>maximum)
            {
                maximum=numbers[i];
            }
        }
        double[] result={minimum,maximum};
        return result;
    }
    
}