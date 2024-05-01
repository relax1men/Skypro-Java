package pro.sky.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int a, int b) {
        return a + "+ " + b + " = " + (a + b);
    }

    @Override
    public String minus(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }


    @Override
    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }


    @Override
    public String divide(int a, int b) {
        if (b == 0) {
            return "Делить на 0  нельзя!";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }
}
