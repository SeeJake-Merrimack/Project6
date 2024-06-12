import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class allows a user to input numbers into a LinkedList. Once finished, the LinkedList is sorted using the Collections framework.
 * 
 * Program was written using VS Code.
 * To compile: javac sortedLinkedList.java
 * To run: java sortedLinkedList.java
 * 
 * @author Jake See
 */
public class sortedLinkedList {
    /**
     * Main driver method
     * 
     * @param args command line arguments (not used in this program)
     * Creates an integer linked list, based off user input (loops until they type "finished")
     * Linked List is then sorted, smallest to largest
     * Prints out the sorted linked list
     */
    public static void main(String[] args) {
        //Reuse: implimenting the built in LinkedList interface to create a linked list, instead of coding up my own linked list program
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // takes user input initially as a string so the loop can be exited with "finished"
            System.out.println("Please enter a number to enter into into the linked list. \nEnter \"finished\" when you are finished.");
            String input = sc.nextLine();

            // loop is broken if 'finished' is given
            if (input.equalsIgnoreCase("finished")) {
                sc.close();
                break;
            }
            // converts input into an int, then added to the list
            try {
                int number = Integer.parseInt(input);
                //Reuse: using the LinkedList built-in method to add to the end of a linked list
                list.add(number);
            // throws an error for any non-int inputs
            } catch (NumberFormatException e){
                System.out.println("\nInput Error. Input must be \"finished\" or a integer to add to the list.\n");
            }
        }
        //Reuse: Utilizing the Collections framework to sort the linked list once all of the integers have been added
        Collections.sort(list);
        System.out.println("Your sorted Linked List --> " + list);   
    }
}

