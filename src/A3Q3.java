
import static com.sun.org.apache.regexp.internal.RETest.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andreeagavris
 */
public class A3Q3 {

    // create a method called countOnes
    public int countOnes(int[] array) {
        // int called numberOne to store all of the number ones
        int numberOne = 0;
        // go through the array and if one is found then add to the original int
        for (int position = 0; position < array.length; position++) {
            if (array[position] == 1) {
                numberOne = numberOne + 1;

            }

        }
        // return the result
        return numberOne;

    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // test the class
        A3Q3 test = new A3Q3();
        //insert the list of numbers
        int[] numbers = {0, 1, 1, 2, 3, 0, 1, 1};
        // create an int that states the amount of ones 
        int n = test.countOnes(numbers);
        // print out the answers
        System.out.println(" There are " + n + " ones that have been detected");

    }

}
