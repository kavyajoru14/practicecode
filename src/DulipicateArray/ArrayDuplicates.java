package DulipicateArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,4,9,7,9};
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
for (int  i=0 ; i < arr.length ; i++) {
	if (set.contains(arr[i])) {
        duplicates.add(arr[i]);
    } else {
        set.add(arr[i]);
    }
}
System.out.println("Duplicates in array:" +duplicates);
}
		}
