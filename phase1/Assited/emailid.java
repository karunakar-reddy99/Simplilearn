public class Jobseeker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your mail id ....");
		String name = scan.nextLine();
		 {
		try {
			validatename(name);
		}catch(namenotvalidException e) {
			System.out.println(e.getMessage());
		}
		}
		
	}
		private static void validatename(String name)throws namenotvalidException{
		if(name.endsWith("@gmail.com")) {
			System.out.println("welcome "+name+" you are logged in....");
		}
		else {
			throw new namenotvalidException("invalid emp name,name should end with @gmail.com");
		}

	}
}
class namenotvalidException extends Exception{
	public namenotvalidException(String message) {
		super(message);
	}
}
