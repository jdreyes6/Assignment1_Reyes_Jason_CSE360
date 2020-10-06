package cse360assignment02;

import java.util.ArrayList;
import java.util.List;

/**
 * class representation of calcuation
 */
public class AddingMachine {
    private int total;
    //a
    private List<String> values;
    /**
     * constructor initializes adding machine
     */
    public AddingMachine () {
        total = 0;// not needed - included for clarity
        values = new ArrayList<>();
    }

    /**
     *
     * method that grabs total
     * @return total
     */
    public int getTotal () {
        return total;
    }

    /**
     * addition to total amount
     * @param value number to addition
     */
    public void add (int value) {
        total = total + value;
        values.add("+ "+value);
    }

    /**
     * subtraction oif total amount
     * @param value number to subtract
     */
    public void subtract (int value) {
        total = total - value;
        values.add("- "+value);
    }

    /**
     * object to string
     * used list for better print out
     * prints out all trnsactions
     * @return simple mathematic arguement print out
     */
    public String toString () {
        //return values.toString();
        String variables = "";
        for(String current : values){
            variables = variables + " " + current;
        }
        return "0" + variables;
    }

    /**
     * reset int total
     */
    public void clear() {
        total = 0;
        values.clear();
    }
}