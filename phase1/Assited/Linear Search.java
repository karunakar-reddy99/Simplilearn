public class LinearSearch {

	public static void main(String[] args) {
		int []arr = {1,6,5,22,3,59};
		int x = 12;
		int output = linear(arr,x);
		if(output == -1)
			System.out.println("Search not found");
		else
			System.out.println("element found at index "+output);
	}
	public static int linear(int arr[],int x) {
		int n = arr.length;
		for(int i=0;i<n;i++)
			if(arr[i]==x)
				return i;
		return -1;
	}

}
