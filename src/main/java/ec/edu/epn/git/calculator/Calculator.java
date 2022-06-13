package ec.edu.epn.git.calculator;
public class Calculator {
    private int answer;
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a, int b) {
        return a / b;
    }
    public void timeout(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public double root(double base, int index) {
        double index1 = 1/(double)(index);
        //double base1 = base;
        return Math.pow(base, index1);
    }
}
