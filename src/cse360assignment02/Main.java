package cse360assignment02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AddingMachine myCalculator = new AddingMachine();
       /* System.out.println(myCalculator);
        myCalculator.add (4);
        System.out.println(myCalculator);
        myCalculator.subtract (2);
        System.out.println(myCalculator);
        */
        myCalculator.add (4);
        myCalculator.subtract (2);
        myCalculator.add(5);
        System.out.println(myCalculator);
        System.out.println(myCalculator.getTotal());
        myCalculator.clear();
        System.out.println(myCalculator);
        System.out.println(myCalculator.getTotal());

    }
}