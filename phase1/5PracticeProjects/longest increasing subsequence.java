public class listofarray {

	static int max;
	public static void main(String[] args) {
		int []arr = {10,15,3,6,9,10,1};
		int n=arr.length;
		System.out.println("The length of longest increasing subsequence is : "+lis(arr,n));

	
	}
	static int lis(int arr[],int n) {
		max = 1;
		lis1(arr,n);
		return max;
	}
	static int lis1(int arr[],int n) {
		if(n==1)
			return 1;
		int res,max1=1;
		for(int i=1;i<n;i++) {
			res=lis1(arr,i);
		if(arr[i-1]<arr[n-1]&& res+1>max1)
			max1=res+1;}
		if(max<max1)
			max=max1;
		return max1;
			
	}

}
