/**
 * Created by Praktika on 5.12.2016.
 */
public class exercise72 {
public static void main(String[] args) {
    squareRoot(9);
}
public static void squareRoot(double a) {
    double x0 = a / 2;
    double x1 = (x0 + a / x0) / 2;
    double x2 = (x1 + a / x1) / 2;
while (Math.abs(x1 - x2) >= 0.0001) {
        x1 = (x2 + a / x2) / 2;
        x2 = (x1 + a / x1) / 2;
    }
    System.out.println(x2);
    }
}
