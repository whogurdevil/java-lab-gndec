import java.util.*;

public class EreverseOfNumber {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print reverse");
        int num = sc.nextInt();
        sc.close();

        while(num != 0){
            int rem = num%10;
            System.out.print(rem);
            num /= 10;
        }
    }
}
