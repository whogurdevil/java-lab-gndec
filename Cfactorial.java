import java.util.Scanner;

public class Cfactorial {

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            Cfactorial result = new Cfactorial();
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
