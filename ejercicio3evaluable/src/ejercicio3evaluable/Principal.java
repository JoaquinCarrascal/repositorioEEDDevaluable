package ejercicio3evaluable;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int [] my_array2;
        // Insert an element in 3rd position of the array (index->2, value->5)
        
        int Index_position = 2;
        int newValue = 5;
        
        System.out.println("Original Array : "+Arrays.toString(my_array));    
        
        my_array2 = new int[my_array.length+1];
        for (int i = 0; i < Index_position; i++) {
			my_array2[i] = my_array[i];
		}
        for(int i=Index_position;i < my_array2.length-1; i++){
            my_array2[i+1] = my_array[i];
        }
        my_array2[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array2));
    }
}