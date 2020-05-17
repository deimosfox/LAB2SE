package Package;

import java.util.Scanner;

public class Calculator {
    public static Scanner in;
    public static double sum;
    public static double number;

    public Calculator() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome input a first number");
        sum = in.nextDouble();
        Interface menu = new Interface();
        menu.Interface();
    }

    static {
        in = new Scanner(System.in);
    }
}
