package Package;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    public Calculator calculator;
    private SimpleCommands scommands;

    public Interface() {
        this.scanner = new Scanner(System.in);
        this.calculator = new Calculator();
        this.scommands = new SimpleCommands();
    }

    void Interface() {
        System.out.println("Input a command , write end to finish your work");
        System.out.println(Calculator.sum);

        for(String option = this.scanner.next(); !option.equals("end"); option = this.scanner.next()) {
            this.selectoption(option);
        }

    }

    public int selectoption(String option) {

        switch(option) {
            case "+":
                double number1 = this.scanner.nextDouble();

                Calculator.sum = this.scommands.Sum(Calculator.sum, number1);

                System.out.println(Calculator.sum);
                break;
            case "-":
                double number2 = this.scanner.nextDouble();
                Calculator.sum = this.scommands.Dec(Calculator.sum, number2);

                System.out.println(Calculator.sum);
                break;
            case "*":
                double number3 = this.scanner.nextDouble();
                Calculator.sum = this.scommands.Mult(Calculator.sum, number3);
                System.out.println(Calculator.sum);
                break;
            case "/":
                double number4 = this.scanner.nextDouble();
                Calculator.sum = this.scommands.Dev(Calculator.sum, number4);
                System.out.println(Calculator.sum);
                break;
            case "sqrt":
                Calculator.sum = this.scommands.Sqrt(calculator.sum);
                System.out.println(Calculator.sum);
            case "pow":
                double number5 = this.scanner.nextDouble();
                Calculator.sum = this.scommands.Pow(Calculator.sum, number5);
                System.out.println(Calculator.sum);
                break;
            case "f":
                Calculator.sum = this.scommands.Fact(calculator.sum);
                System.out.println(Calculator.sum);
            case "abs":
                Calculator.sum = this.scommands.Abs(calculator.sum);
                 System.out.println(Calculator.sum);
            case "end" :
                System.out.println("The result is" + Calculator.sum);
                break;
            default:
                System.out.println("Wrong command");
                return -1;
        }

        return 0;
    }
}
