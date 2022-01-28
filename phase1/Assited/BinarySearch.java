public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int arr[] = {1,10,5,15,8,66,9,7};
		int x = 66;
		int n = arr.length;
		int output = obj.binarysearch(arr,0,n-1,x);
		if(output == -1) 
			System.out.println("Entered number is not found");
		else
			System.out.println("Entered number is present at index : "+output);

	}
	public static int binarysearch(int arr[],int l,int r,int x) {
		 if (r >= l) {
	            int mid = l + (r - l) / 2;
	            if (arr[mid] == x)
	                return mid;
	 
	            if (arr[mid] > x)
	                return binarysearch(arr, l, mid - 1, x);
	 
	            return binarysearch(arr, mid + 1, r, x);
	        }
	 
	        return -1;
	}
}
