package ru.Company.firstTask;

public class Calculator {
    protected <E extends Number> void multiply  (E num1, E num2) {
        double result = num1.doubleValue() * num2.doubleValue();
        System.out.println("Результат умножения " + num1 + " и " + num2 + " равно " + result);
    }
    protected <E extends Number> void divide  (E num1, E num2) {
        double result = num1.doubleValue() / num2.doubleValue();
        System.out.println("Результат деления " + num1 + " и " + num2 + " равно " + result);
    }

    //String phraseForBinaryOutPut = "В результате перевода числа " + number + " в двоичную систему будет ";
    protected void NumToBinary (int num) {
        NumToBinaryBase(num);
    }
    protected void StringNumToBinary(String numString) {
        int num = Integer.parseInt(numString);
        NumToBinaryBase(num);
    }

    protected void NumToBinaryBase(int num) {
        String result = Integer.toString(num, 2);
        System.out.println("В результате перевода числа " + num + " в двоичную систему будет " + result);
    }
}
