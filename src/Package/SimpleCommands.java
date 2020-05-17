package Package;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SimpleCommands {
    public SimpleCommands() {
    }

    public double Sum(double sum, double number) {
        return sum + number;
    }

    public double Dec(double sum, double number) {
        return sum - number;
    }

    public double Mult(double sum, double number) {
        return sum * number;
    }

    public double Dev(double sum, double number) {
        return sum / number;
    }

    public double Sqrt(double sum) {
        return sqrt(sum);
    }

    public double Pow(double sum, double n) {
        return pow(sum, n);
    }

    public double Fact(double sum){
        double res=1;
        for (int i=2; i<=sum; i++){
            res*=i;
        }
        return res;
    }
}
