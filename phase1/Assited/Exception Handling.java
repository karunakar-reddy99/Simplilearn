import java.util.Scanner;

public class Exceptionhandler {

	public static void main(String[] args) {
		int first,second;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers....");
		first = scan.nextInt();
		second = scan.nextInt();
		divide(first,second);
	}
	static void divide(int first,int second) {
	int result;
	try {
		result = first/second;
		System.out.println(result);
	}
	catch(ArithmeticException ae) {
		System.out.println("divided by zero is not applicable");
	}

}
}
