/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreeagavris
 */
public class A3Q5 {

    // make a method called insertionSort 
    public void insertionSort(String[] array) {
        //going to through the array
        for (int i = 0; i < array.length - 1; i++) {
            //make an int that stores position
            int position = i;
            //go through the array and arrange the words if the position is incorrect change swap the psotions 
            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                swap(array, position, position + 1);
                position--;
            }
        }
    }

    //Swap method
    public void swap(String[] array, int p1, int p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test the method
        A3Q5 test = new A3Q5();
        //insert the words
        String[] array = {"cat", "dog", "eat", "apple"};
        // print the words before
        System.out.println("WORDS BEFORE: ");
        test.print(array);
        // print the words after the method was used and teh wrods are sorted
        System.out.println("WORDS AFTER: ");
        test.insertionSort(array);
        test.print(array);
    }

    //the order of the the method is printed
    private void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(" ");
    }

}
