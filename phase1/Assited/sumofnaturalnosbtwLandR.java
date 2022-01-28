import java.util.Scanner;

public class sumofnaturalnosbtwLandR {

	public static void main(String[] args) {
		int l,r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for L");
		l = scan.nextInt();
		System.out.println("Enter number for R");
		r = scan.nextInt();
		System.out.println("Sum of naturl numbers form" + l + " to "+ r +" :"+sumof(l,r));

	}
	static int sumofn(int n) {
		int sum =(n*(n+1))/2;
		return sum;
	}
	static int sumof(int l,int r) {
		return sumofn(r)-sumofn(l-1);
	}

}
