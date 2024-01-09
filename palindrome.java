import java.util.*;
public class palindrome {
    boolean palin(int n){
        String str = Integer.toString(n);
        int start = 0;
        int end = str.length()-1;
        while( end>start){
            if( str.charAt(start) != str.charAt(end) ){
                return false;
            }
            end--;
            start++;
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String");
            int st = sc.nextInt();
            palindrome pal = new palindrome();
            if(pal.palin(st)){
                System.out.println("Number is Palindrome");
            }
            else{
                System.out.println("String is Not Palindrome");

            }
        }
    }
}
