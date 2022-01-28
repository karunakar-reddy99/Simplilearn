import java.util.Scanner;

public class OneDandTwoDarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//1D array
		int [] arr = new int[5];
		System.out.println("enter numbers for 1D array");
		for(int i=0;i<5;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<5;i++)
			System.out.print(arr[i]+"   ");
	//2D array
		int [][] arr1 = new int[2][2];
		for(int k=0;k<2;k++)
		System.out.println("enter numbers for 2D array");
			for(int j=0;j<2;j++)
				arr1[k][j]=scan.nextInt();
		for(int k=0;k<2;k++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr1[k][j]+"  ");
			}
			System.out.println(" ");
		}
	}

}
