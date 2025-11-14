package bmi;
import java.lang.Math;

/**
 *
 * @author ojb105
 */
public class BMICalculator {
    public double calculator(int feet, int inches, double pounds) {
        double result = (pounds*703)/Math.pow(feet*12+inches, 2);
        return Math.round(result*10.0) / 10.0;
    }
}
