import java.util.Scanner;

public class factorial {

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            factorial result = new factorial();
            System.out.println("Enter the Number");

            int n = sc.nextInt();
            double res = result.fact(n);
            System.out.println("Factorial is " + res);
        }

    }

    public double fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }

}
