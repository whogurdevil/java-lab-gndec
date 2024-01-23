import java.util.Scanner;

public class AstarPattern{
	public static void main(String[] args) {
		System.out.println("meaaow world");
		printTriangle();
	}

	public static void printTriangle(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows to print triangle");
		int rows = scanner.nextInt();
        scanner.close();

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
