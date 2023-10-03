public class MinMaxCalculation {
    public static double min(double... numbers) {
        if (numbers.length == 0) {
            // Checks if double numbers array is empty, if yes, throws an exception
            throw new IllegalArgumentException("Please enter valid numbers as input. Null array not accepted ");
        }

        double minimum = numbers[0]; // Initializing minimum as the first element in the array

        for (int i = 0; i < numbers.length; i++) {
            // If the number at the i-th index is smaller than minimum
            if (numbers[i] < minimum) {
                minimum = numbers[i]; // Update the minimum
            }
        }
        return minimum; // Returning the minimum value
    }

    public static double max(double... numbers) {
       if (numbers.length == 0) {
            // Checks if double numbers array is empty, if yes, throws an exception
            throw new IllegalArgumentException("Please enter valid numbers as input. Null arrays not accepted");
        }

        double maximum = numbers[0]; // Initializing maximum as the first element in the array

        for (int i = 0; i < numbers.length; i++) {
            // If the number at the i-th index is greater than maximum
            if (numbers[i] > maximum) {
                maximum = numbers[i]; // Update the maximum
            }
        }
        return maximum; // Returning the maximum value
    }
    
}