import java.util.Scanner;

public class sumofdigits {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int input = sc.nextInt();
            int sum = 0;
            // System.out.println("Enter the number of lines "+input);
            while(input>0){
                sum += input%10;
                input/=10;
            }
                    System.out.println("Sum of Digits = " + sum);
    
        }


    }
}
