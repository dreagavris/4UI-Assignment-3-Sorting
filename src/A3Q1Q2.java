/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andreeagavris
 */
public class A3Q1Q2 {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {
        // keep track of which position we are sorting
        //EVERYTIME YOU WANT TO GO THROUGH THE POSTIONS IN THE ARRAY THEN DO THE FOLLOWING CODE
        for (int position = 0; position < array.length; position++) {

            //create an integer called number that starts with the smallest postion in the array. 
            int smallestNumber = position;

            // go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                // have we found smaller number in the array?
                if (array[i] < array[position]) {
                    smallestNumber = i;

                    // swap numbers to postion 0 in the array. 
                }

            }
            swap(array, smallestNumber, position);
        }
    }

    public int smallestMissingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if( array[i] + 1 != array[i+1]){
                return array[i] + 1; 
                
            }
            
            

        }
        return -1;
    }
    
        
    public static void main(String[] args) {

        A3Q1Q2 test = new A3Q1Q2();

        // making a random array of ints
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }
        System.out.println("BEFORE: (");
        for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
        }
        //SORT HERE
        test.selectionSort(numbers);

        //AFTER
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
        }
        System.out.println("The smallest missing number is the following");
        System.out.println(test.smallestMissingNumber(numbers));
        
        
    
        
    }

}
