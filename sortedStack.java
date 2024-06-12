import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class allows a user to input numbers into a Stack. Once finished, the Stack is sorted using the Collections framework. 
 * 
 * Program was written using VS Code.
 * This code was a maintenance from the original sortedLinkedList. 
 * Maintenance was very simple and required only a few simple changes. Import java,util.Stack over Linkedlist.
 * LinkedList<Integer> replaced by Stack<Integer>; variable 'list' --> 's', list.add() --> s.push().
 * 
 * To compile: javac sortedStack.java. 
 * To run: java sortedStack.java. 
 * 
 * Reuse: implimenting the built in Stack interface to create a stack (instead of coding up my own stack program), 
 * using the Stack built-in method to push(add) to the end of a stack, 
 * utilizing the Collections framework to sort the stack once all of the integers have been added. 
 * 
 * @author Jake See
 */
public class sortedStack {
    /**
     * Main driver method
     * 
     * @param args command line arguments (not used in this program). 
     * Creates an integer stack, based off user input (loops until they type "finished"). 
     * Input is a String to determine if "finished" was typed. 
     * If not, input is converted into an Integer and added to the stack. 
     * Exception is thrown if the input is neither Integer or "finished". 
     * The Stack is then sorted, smallest to largest. 
     * Prints out the sorted stack.
     */
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            // takes user input initially as a string so the loop can be exited with "finished"
            System.out.println("Please enter a number to enter into the stack. \nEnter \"finished\" when you are finished.");
            String input = sc.nextLine();

            // loop is broken if 'finished' is given
            if (input.equalsIgnoreCase("finished")) {
                sc.close();
                break;
            }
            // converts input into an int, then added to the list
            try {
                int number = Integer.parseInt(input);
                s.push(number);
            // throws an error for any non-int inputs
            } catch (NumberFormatException e){
                System.out.println("\nInput Error. Input must be \"finished\" or a integer to add to the list.\n");
            }
        }
        Collections.sort(s);
        System.out.println("Your sorted Stack --> " + s);   
    }
}

