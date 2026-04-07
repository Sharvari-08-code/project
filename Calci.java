import java.util.*;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 5;

        System.out.println("===== JAVA CALCULATOR =====");
        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        sc.close();
    }
}