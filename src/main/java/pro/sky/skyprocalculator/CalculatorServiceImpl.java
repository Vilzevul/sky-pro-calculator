package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return String.valueOf( num1 + num2);
    }

    public String minus(int num1, int num2) {
        return String.valueOf (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return String.valueOf (num1 * num2);
    }

    public String div(int num1, int num2) {
        if (num2 == 0) throw new IllegalArgumentException("Делить на ноль нельзя");
        return String.valueOf(num1 / num2);
    }
}
