package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionsService {
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentExeption(IllegalArgumentException e) {
        System.out.println("Привет! Тут ошибочка вышла - на ноль не делят");
        return e.getMessage();
    }

}
