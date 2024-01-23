import java.io.DataInputStream;
import java.io.IOException;

class palindromeNumber{
    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter string to check palindrome");
        String str = dis.readLine();
        dis.close();
        
        int start = 0;
        int end = str.length() - 1;

        while(start<end){
            char c1 = str.charAt(start);
            char c2 = str.charAt(end);

            if(c1 != c2){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println("Is a palindrome");

    }
}