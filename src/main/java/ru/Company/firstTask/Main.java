package ru.Company.firstTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiply(10, 2);
        calculator.divide(10.0, 4.0);
        calculator.NumToBinary(2);
        calculator.StringNumToBinary("4");
    }
}