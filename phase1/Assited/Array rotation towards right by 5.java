import java.util.Scanner;

public class MoveArray {

	public static void main(String[] args) {
		int [] arr = new int[10];
		int n = 5;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array");
		for(int i=0;i<10;i++)
			arr[i]=scan.nextInt();
		 for(int i = 0; i < n; i++){    
	            int j, last;       
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){       
	                arr[j] = arr[j-1];    
	            }    
	     
	            arr[0] = last;    
	        }    
	        
	        System.out.println();    
	        
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    }    


	}
