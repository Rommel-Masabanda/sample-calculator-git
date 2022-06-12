package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("____----| Calculator Execute |----____");

        Calculator c = new Calculator();
        int addition = c.addition(6,3);
        System.out.println("c.addition(6,3) = " + addition);

        int subtraction = c.subtraction(12,7);
        System.out.println("c.subtraction(12,7) = " + subtraction);

        int division  = (int) c.division(10,3);
        System.out.println("c.division(10,3) = " + division);

        System.out.println("____----| Finish |----____");

    }
}
