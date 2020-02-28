package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();
        calculator.sum(10.2, 5);
        calculator.subtract(100.6, 8.7);
        calculator.divide(4, 5.7);
        calculator.multiply(2, 5);


        //TODO Use the calculator to calculate different values
        //Example ->
        //calculator.sum(10.2, 5);
        //calculator.divide(100, 33);
        // and more

    }

    //TODO create the Calculator (here or in additional class)
    public double sum(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public double subtract(double x, double y) {
        double diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    public double multiply(double x, double y) {
        double temp = x * y;
        return temp;
    }

    public double divide(double x, double y) {
        double divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;

    }

}
