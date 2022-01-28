import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int arr[] = {1,6,99,8,61,5,4,7};
		int x=8;
		int result = exponentialsearch(arr,arr.length,x);
		System.out.println((result<0)?
				"Element is not present in array":
					"Element is present at index"+result);
	}
	static int exponentialsearch(int arr[],int n,int x) {
		if(arr[0]==x)
			return 0;
		int i=1;
		while(i<1 && arr[i]<=x)
			i=i*2;
		  return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
	}

}
