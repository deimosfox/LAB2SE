/**
 * @autor Alexey Konnov
 * @version 1.4
 */
package Package;

import java.util.Scanner;

public class Calculator {
    /** Constr of Calculator
     * @param in - input data
     * @param priece - цена
     * */
    public static Scanner in;
    public static double sum;
    public static double number;

    public Calculator() {
    }

    /**
     * Main class
     * @param args-default param
     */
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
