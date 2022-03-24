package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorService implements CalculatorInterface{

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return (num1 + " + " + num2 + " = " + (int) (num1 + num2));
    }

    public String minus(int num1, int num2) {
        return (num1 + " - " + num2 + " = " + (int) (num1 - num2));
    }

    public String multiply(int num1, int num2) {
        return (num1 + " * " + num2 + " = " + (int) (num1 * num2));
    }

    public String div(double num1, double num2) {
        return (num1 + " / " + num2 + " = " + (double) (num1 / num2));
    }
}
