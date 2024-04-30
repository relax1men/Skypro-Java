package pro.sky.controller;

import org.mockito.NotExtensible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer a,
                       @RequestParam(value = "num2", required = false) Integer b) {
        String checkResult = checkParameters(a, b);
        if (checkResult != null) {
            return checkResult;
        }
        return calculatorService.plus(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer a,
                        @RequestParam(value = "num2", required = false) Integer b) {
        String checkResult = checkParameters(a, b);
        if (checkResult != null) {
            return checkResult;
        }
        return calculatorService.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer a,
                           @RequestParam(value = "num2", required = false) Integer b) {
        String checkResult = checkParameters(a, b);
        if (checkResult != null) {
            return checkResult;
        }
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer a,
                         @RequestParam(value = "num2", required = false) Integer b) {
        String checkResult = checkParameters(a, b);
        if (checkResult != null) {
            return checkResult;
        }
        return calculatorService.divide(a, b);
    }

    private String checkParameters(Integer a, Integer b) {
        if (a == null) {
            return "Параметр num1 не передан!";
        }
        if (b == null) {
            return "Параметр num2 не передан!";
        }
        return null;
    }
}
