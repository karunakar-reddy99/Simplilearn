\\throw

public class AboutThrow {
	public static void main(String []args) {
		demo();
		
	}
	static void demo() {
		try {
			throw new ArithmeticException("demo");
		}
		catch(ArithmeticException e){
			System.out.println("exception occured");
		}
	}
}

=========================================================================================================
//throws



public class AboutThrows {

	public static void main(String[] args) {
		try {
			Check();
			
		}
		catch (ArithmeticException e) {
			System.out.println("caught "+e);
		}
	}
	static void Check() throws ArithmeticException{
		System.out.println("inside Check function");
		throw new ArithmeticException("function");
		
	}

}




=========================================================================================================
//finally



public class AboutFinally {
	public static void main(String [] args) {
		
	int Arr[]= new int [2];
	System.out.println("Out of Try");
	try {
	System.out.println("Access Invalid Element"+Arr[3]);

	}
	finally {
		System.out.println("Finally always executed");
	}
	
}

}




=========================================================================================================
