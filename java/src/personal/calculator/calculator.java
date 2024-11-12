package personal.calculator;

import java.util.*;

/*
 08-13-2024
 augustjones
 */
public class calculator {
    // :3

    private double number1;
    private double number2;
    private String operator;
    static Scanner ui = new Scanner(System.in);
    static calculator c = new calculator();
    static String[] operators = { "+", "-", "*", "/", "^", "sqrt" };

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double add() {
        return getNumber1() + getNumber2();
    }

    public double subtract() {
        return getNumber1() - getNumber2();
    }

    public double multiply() {
        return getNumber1() * getNumber2();
    }

    public double divide() {
        return getNumber1() / getNumber2();
    }

    public double pow() {
        double ans = 0;
        for (int i = 0; i >= getNumber2(); i++) {
            ans = getNumber1() * ans;
        }
        return ans;
    }

    public double sqrt() {
        double number = getNumber1();
        double t;
        double squareroot = number / 2;
        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        } while ((t - squareroot) != 0);
        return squareroot;
    }

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        String temp = "";
        boolean temp2 = false;
        System.out.print("Enter Number: ");
        c.setNumber1(ui.nextDouble());
        System.out.println("List of valid operations!");
        for (int i = 0; i <= operators.length - 1; i++) {
            System.out.println((i + 1) + ". " + operators[i]);
        }
        System.out.print("Enter operator: ");
        ui.next().toLowerCase();
        c.setOperator(temp);
        System.out.print("Enter Number: ");
        c.setNumber2(ui.nextDouble());
    }

    public static void operatorCheck(String operator) {
        switch (operator) {
            case "+":
                double addsum = c.add();
                System.out.println(c.getNumber1() + " " + c.getOperator() + " " + c.getNumber2());
                System.out.println(addsum);
                calculator();
                break;
            case "-":
                double subsum = c.subtract();
                calculator();
                break;
            case "*":
                double mulproduct = c.multiply();
                calculator();
                break;
            case "/":
                double divproduct = c.divide();
                calculator();
                break;
            case "^":
                double pow = c.pow();
                calculator();
                break;
            case "sqrt":
                double sqrt = c.sqrt();
                calculator();
                break;
        }
    }
}
