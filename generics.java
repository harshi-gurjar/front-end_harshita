import java.util.Scanner;

class Calculator<T extends Number> {
    double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
    double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
    double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a.doubleValue() / b.doubleValue();
    }
}
public class generics {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a/b);

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(a*b);
        System.out.println(a-b);

        sc.close();
    }
}