public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int arr[] = {2,5,3,6,9,8,7,4,12};
		obj.sort(arr);
		obj.output(arr);
	}
	void sort(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;}}}
	}
	void output(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
}
