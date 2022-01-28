public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int arr[] = {3,6,4,8,9,10,45,55};
		obj.sort(arr);
		obj.output(arr);
	}
	void sort(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;}}}
	}
	void output(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();

	}

}
