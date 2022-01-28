public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int arr[] = {6,10,18,24,12,25,16,22};
		obj.sort(arr);
		obj.output(arr);
	}
	void sort(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n;++i) {
			int k=arr[i];
			int j=i-1;
			while(j>0 && arr[j]>k) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=k;
		}
	}
	void output(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();

	}

}
