import java.util.Arrays;
import java.util.Scanner;

public class FourthSmallest {

	public static void main(String[] args) {
		int [] arr = new int[10];
		int k=4;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter unsorted array");
		for(int i=0;i<10;i++) 
			arr[i] = scan.nextInt();
		System.out.println("the 4th smallest number in unsorted array is :"+smallest(arr,k));

	}
	public static int smallest(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
}
