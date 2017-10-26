/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreeagavris
 */
public class A3Q4 {

    // create a method class called countingSort
    public void countingSort(int[] array) {
        // create an int that stores the the amount of numbers 
        int counterNumber = 0;
        // create an arrat that stores 100 numbers
        int[] tracker = new int[101];
        // run this loop until its the length of the original array
        for (int position = 0; position < array.length; position++) {
            //the counter number equals the value and compare positions in the main array
            counterNumber = array[position];
            //add 1 to the counterNumber
            tracker[counterNumber] = tracker[counterNumber] + 1;
        }
        // first int; keep track of the numbers in the original array
        int firstValue = 0;
        // second int; keep track of the numbers in the array
        int secondvalue = 0;

        while (firstValue < array.length) {
            // if the value in the tracker array is greater than 0
            if (tracker[secondvalue] > 0) {
                //equal to the position of the value in the tracker array
                array[firstValue] = secondvalue;
                // subtract one from the value in the tracker array at position w
                tracker[secondvalue]--;
                // move to the next spot in the main array
                firstValue++;
            } else {
                // the value of position w in the array is 0 move and to the next spot in the tracker array
                secondvalue++;
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the method
        A3Q4 test = new A3Q4();
        // making a random array of ints
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        System.out.println("The numbers that are stated are sorted.");
        test.countingSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
