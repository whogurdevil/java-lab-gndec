import java.util.Scanner;
class stars {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of lines");
            int input = sc.nextInt();
            String str = "";
            // System.out.println("Enter the number of lines  "+input);
            for(int i = 0; i <input; i++){
                str = str+"* ";
                System.out.println(str);
            }
        }

        

    }
}
