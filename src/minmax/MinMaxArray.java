package minmax;

public class MinMaxArray {
	 
	    public static void main(String[] args) {
	        // Define the array to search
	        int[] array = {5, 2, 9, 7, 1, 3};
	        
	        // Initialize min and max to the first element of the array
	        int min = array[0];
	        int max = array[0];
	        
	        // Search for the minimum and maximum values
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        
	        // Print the result
	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
}
	


    