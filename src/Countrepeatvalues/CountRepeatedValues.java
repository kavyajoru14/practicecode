package Countrepeatvalues;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedValues {

	public static void main(String[] args) {
		        int[] array = {1, 2, 3, 2, 4, 3, 5, 3};
		        
		        Map<Integer, Integer> valueCounts = new HashMap<>();
		        for (int value : array) {
		            if (valueCounts.containsKey(value)) {
		                valueCounts.put(value, valueCounts.get(value) + 1);
		            } else {
		                valueCounts.put(value, 1);
		            }
		        }
		        
		        int count = 0;
		        for (int value : valueCounts.keySet()) {
		            if (valueCounts.get(value) > 1) { 
		       
		                count++;
		            }
		        }
		        System.out.println("Number of repeated values: " + count);
		    }
		}
